package com.serrodcal.application.command;

import java.util.Date;

public class MakeTransactionCommand {

    private String account;
    private String description;
    private Double amount;
    private String currency;
    private Date date;

    public MakeTransactionCommand(String account, String description, Double amount, String currency, Date date) {
        this.account = account;
        this.description = description;
        this.amount = amount;
        this.currency = currency;
        this.date = date;
    }

    public String getAccount() {
        return account;
    }

    public String getDescription() {
        return description;
    }

    public Double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public Date getDate() {
        return date;
    }

}
