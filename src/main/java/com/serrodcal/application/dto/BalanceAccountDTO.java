package com.serrodcal.application.dto;

public class BalanceAccountDTO {

    private Double amount;
    private String currency;

    public BalanceAccountDTO(Double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Double getAmount() { return this.amount; }

    public String getCurrency() { return this.currency; }

}
