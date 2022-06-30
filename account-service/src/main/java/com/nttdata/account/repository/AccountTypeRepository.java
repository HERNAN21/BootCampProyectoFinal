package com.nttdata.account.repository;

import com.nttdata.account.model.AccountType;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTypeRepository extends ReactiveMongoRepository<AccountType, String> {

}