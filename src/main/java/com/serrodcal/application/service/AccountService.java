package com.serrodcal.application.service;

import com.serrodcal.application.command.CreateAccountCommand;
import com.serrodcal.application.command.MakeTransactionCommand;
import com.serrodcal.application.dto.*;
import com.serrodcal.application.query.FindAccountQuery;
import com.serrodcal.application.query.GetBalanceQuery;
import com.serrodcal.domain.repository.AccountRepository;
import com.serrodcal.shared.util.CurrencyUtil;
import io.smallrye.mutiny.Uni;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Currency;
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
        UUID.fromString(query.getUuid());
        return Uni.createFrom().item(new AccountInformationDTO(
                query.getUuid(),
                "ES1212341234121234567890",
                0,
                1492.89,
                "EUR",
                new Date(630370800000l)
        ));
    }

    public Uni<BalanceAccountDTO> getBalanceByUUID(GetBalanceQuery query) {
        return Uni.createFrom().item(new BalanceAccountDTO(
                1492.89,
                "EUR"
        ));
    }

    public Uni<TransactionResultDTO> makeTransaction(MakeTransactionCommand command) {
        return Uni.createFrom().item(new TransactionResultDTO(
                true,
                101.20,
                CurrencyUtil.getEURO()
        ));
    }

}
