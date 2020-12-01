package com.serrodcal.poc.application.service;

import com.serrodcal.poc.application.command.MakeTransactionCommand;
import com.serrodcal.poc.application.dto.TransactionResultDTO;
import com.serrodcal.poc.domain.repository.TransactionRepository;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class TransactionsService {

    @Inject
    @Named("postgresqlTransaction")
    TransactionRepository transactionRepository;

    @Inject
    AccountService accountService;

    public Uni<TransactionResultDTO> makeTransaction(MakeTransactionCommand command) {
        return null;
    }

}
