package com.serrodcal.presentation.resource.payload.request;

import com.serrodcal.presentation.resource.exception.TransactionDescriptionIsEmptyException;
import com.serrodcal.shared.util.CurrencyUtil;

import java.util.Date;
import java.util.Objects;

public class MakeTransactionRequestPayload {

    // Could be an UUID or an IBAN, depending on the kind of transaction
    private String account;
    private String description;
    // Signed
    private Double amount;
    // ISO 4217; Euro by default
    private String currency;
    private Date date;

    public MakeTransactionRequestPayload() { }

    public MakeTransactionRequestPayload(String account, String description, Double amount, String currency, Long date) {
        Objects.requireNonNull(account, "Account identifier is required to make a transaction");
        Objects.requireNonNull(description, "Description is required to make a transaction");
        if (description.isEmpty())
            throw new TransactionDescriptionIsEmptyException("Description is required to make a transaction");
        Objects.requireNonNull(account, "Amount is required to make a transaction");

        this.account = account;
        this.description = description;
        this.amount = amount;
        if (currency != null)
            this.currency = currency;
        else
            this.currency = CurrencyUtil.getEURO();
        this.date = new Date(date);
    }


    public String getAccount() { return this.account; }

    public String getDescription() { return this.description; }

    public Double getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Date getDate() { return this.date; }

    @Override
    public String toString() {
        return "MakeTransactionPayload{" +
                "account='" + account + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", date=" + date +
                '}';
    }

}
