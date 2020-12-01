package com.serrodcal.infrastructure.repository.impl;

import com.serrodcal.domain.repository.AccountRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@ApplicationScoped
@Named("postgresqlAccount")
public class ReactivePostgreSQLAccountRepository implements AccountRepository {

}
