package com.serrodcal.application.service;

import com.serrodcal.application.command.MakeTransactionCommand;
import com.serrodcal.application.dto.TransactionResultDTO;
import com.serrodcal.domain.repository.TransactionRepository;
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
