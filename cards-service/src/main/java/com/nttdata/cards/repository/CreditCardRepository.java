package com.nttdata.cards.repository;

import com.nttdata.cards.model.EnterpriseCreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CreditCardRepository extends ReactiveMongoRepository<EnterpriseCreditCard, String> {

    Mono<EnterpriseCreditCard> findByIdClient(String idClient);
}