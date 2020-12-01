package com.serrodcal.poc.application.dto;

import com.serrodcal.poc.domain.account.AccountType;

import java.util.Date;
import java.util.List;

public class AccountInformationDTO {

    private String uuid;
    private String iban;
    private Integer type;
    private Double balance;
    private String currency;
    private Date creationDate;

    public AccountInformationDTO(String uuid, String iban, Integer type, Double balance, String currency, Date creationDate) {
        this.uuid = uuid;
        this.iban = iban;
        this.type = type;
        this.balance = balance;
        this.currency = currency;
        this.creationDate = creationDate;
    }

    public String getUuid() { return this.uuid; }

    public String getIban() { return this.iban; }

    public Integer getType() { return this.type; }

    public Double getBalance() { return this.balance; }

    public String getCurrency() { return this.currency; }

    public Date getCreationDate() { return this.creationDate; }

}
