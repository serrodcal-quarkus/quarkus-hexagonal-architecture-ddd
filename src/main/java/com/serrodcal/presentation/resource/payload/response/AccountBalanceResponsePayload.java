package com.serrodcal.presentation.resource.payload.response;

public class AccountBalanceResponsePayload {

    private Double amount;
    private String currency;

    public AccountBalanceResponsePayload(Double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Double getAmount() { return this.amount; }

    public String getCurrency() { return this.currency; }

}
