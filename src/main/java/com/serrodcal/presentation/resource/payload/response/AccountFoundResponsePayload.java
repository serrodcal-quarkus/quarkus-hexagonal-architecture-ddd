package com.serrodcal.presentation.resource.payload.response;

public class AccountFoundResponsePayload {

    private String uuid;
    private String iban;
    private Integer type;
    private Double balance;
    private String currency;

    public AccountFoundResponsePayload(String uuid, String iban, Integer type, Double balance, String currency) {
        this.uuid = uuid;
        this.iban = iban;
        this.type = type;
        this.balance = balance;
        this.currency = currency;
    }

    public String getUuid() { return this.uuid; }

    public String getIban() { return this.iban; }

    public Integer getType() { return this.type; }

    public Double getBalance() { return this.balance; }

    public String getCurrency() { return this.currency; }

}
