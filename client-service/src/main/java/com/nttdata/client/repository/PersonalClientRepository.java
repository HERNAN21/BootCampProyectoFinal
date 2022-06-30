package com.nttdata.client.repository;

import com.nttdata.client.model.PersonalClient;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository

public interface PersonalClientRepository extends ReactiveMongoRepository<PersonalClient, String> {

    Mono<PersonalClient> findByDocumentNumber(String documentNumber);

    Mono<Boolean> existsByDocumentNumber(String documentNumber);

}