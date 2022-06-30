package com.nttdata.cards.service;

import com.nttdata.cards.model.EnterpriseCreditCard;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface CreditCardService {

    public Flux<EnterpriseCreditCard> getAll();

    public Mono<EnterpriseCreditCard> getById(String id);

    public Mono<EnterpriseCreditCard> save(EnterpriseCreditCard enterpriseCreditCard);

    public Mono<EnterpriseCreditCard> update(EnterpriseCreditCard enterpriseCreditCard);

    public Mono<EnterpriseCreditCard> delete(String id);

    Mono<EnterpriseCreditCard> getByIdClient(String idClient);

}