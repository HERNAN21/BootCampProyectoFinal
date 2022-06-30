package com.nttdata.account.service;

import com.nttdata.account.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface AccountService {

    public Flux<Account> getAll();

    public Mono<Account> getById(String id);

    public Mono<Account> save(Account account);

    public Mono<Account> update(Account account);

    public Mono<Account> delete(String id);
}