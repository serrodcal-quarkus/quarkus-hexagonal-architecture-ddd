package com.serrodcal.application.service;

import com.serrodcal.application.command.CreateAccountCommand;
import com.serrodcal.application.command.MakeTransactionAccountCommand;
import com.serrodcal.application.dto.AccountInformationDTO;
import com.serrodcal.application.dto.BalanceAccountDTO;
import com.serrodcal.application.dto.NewAccountDTO;
import com.serrodcal.application.dto.TransactionAccountResultDTO;
import com.serrodcal.application.query.FindAccountQuery;
import com.serrodcal.application.query.GetBalanceQuery;
import com.serrodcal.domain.repository.AccountRepository;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Date;
import java.util.UUID;

@Singleton
public class AccountService {

    @Inject
    @Named("postgresqlAccount")
    AccountRepository accountRepository;

    public Uni<NewAccountDTO> createAccount(CreateAccountCommand command) {
        return Uni.createFrom().item(new NewAccountDTO(
                UUID.randomUUID().toString(),
                "ES1212341234121234567890")
        );
    }

    public Uni<AccountInformationDTO> findAccount(FindAccountQuery query) {
        try {
            UUID.fromString(query.getUuid());
            return Uni.createFrom().item(new AccountInformationDTO(
                    query.getUuid(),
                    "ES1212341234121234567890",
                    0,
                    1492.89,
                    "EUR",
                    new Date(630370800000l)
            ));
        } catch (IllegalArgumentException e) {
            return Uni.createFrom().failure(e);
        }
    }

    public Uni<BalanceAccountDTO> getBalanceByUUID(GetBalanceQuery query) {
        try {
            UUID.fromString(query.getUuid());
            return Uni.createFrom().item(new BalanceAccountDTO(
                    1492.89,
                    "EUR"
            ));
        } catch (IllegalArgumentException e) {
            return Uni.createFrom().failure(e);
        }
    }

    public Uni<TransactionAccountResultDTO> makeTransaction(MakeTransactionAccountCommand command) {
        return null;
    }

}
