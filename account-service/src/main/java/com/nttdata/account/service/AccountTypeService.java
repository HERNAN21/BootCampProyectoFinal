package com.nttdata.account.service;

import com.nttdata.account.model.AccountType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface AccountTypeService {

    public Flux<AccountType> getAll();

    public Mono<AccountType> getById(String id);

    public Mono<AccountType> save(AccountType accountType);

    public Mono<AccountType> update(AccountType accountType);

    public Mono<AccountType> delete(String id);
}