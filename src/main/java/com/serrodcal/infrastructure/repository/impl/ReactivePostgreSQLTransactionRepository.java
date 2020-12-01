package com.serrodcal.infrastructure.repository.impl;

import com.serrodcal.domain.repository.TransactionRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named("postgresqlTransaction")
public class ReactivePostgreSQLTransactionRepository implements TransactionRepository {

}
