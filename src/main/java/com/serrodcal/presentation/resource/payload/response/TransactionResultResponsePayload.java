package com.serrodcal.presentation.resource.payload.response;

public class TransactionResultResponsePayload {

    private Boolean result;
    private Double balance;
    private String currency;

    public TransactionResultResponsePayload(Boolean result, Double balance, String currency) {
        this.result = result;
        this.balance = balance;
        this.currency = currency;
    }

    public Boolean getResult() {
        return result;
    }

    public Double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

}
