package com.nttdata.client.service;

import com.nttdata.client.model.PersonalClient;
import com.nttdata.client.model.dto.*;
import com.nttdata.client.model.dto.Personal.CreatePersonalClientAccountDto;
import com.nttdata.client.model.dto.Personal.CreatePersonalClientDto;
import com.nttdata.client.model.dto.Personal.DeletePersonalClientDto;
import com.nttdata.client.model.dto.Personal.UpdatePersonalClientAccountDto;
import com.nttdata.client.model.dto.Personal.UpdatePersonalClientDto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public interface ClientService {

    public interface PersonalClientService {

        public Flux<PersonalClient> getAll();

        public Mono<PersonalClient> getById(String id);

        public Mono<PersonalClient> getByDocumentNumber(String documentNumber);

        public Mono<PersonalClient> save(CreatePersonalClientDto o);

        public Mono<PersonalClient> addAccount(String document, CreatePersonalClientAccountDto o);

        public Mono<PersonalClient> updateAccount(String document, UpdatePersonalClientAccountDto o);

        public Mono<PersonalClient> deleteAccount(String document, String accountId);

        public Mono<PersonalClient> update(UpdatePersonalClientDto o);

        public Mono<PersonalClient> delete(DeletePersonalClientDto o);
    }
}


