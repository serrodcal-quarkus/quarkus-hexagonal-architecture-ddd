package com.serrodcal.poc.application.dto;

public class NewAccountDTO {

    private String uuid;
    private String iban;

    public NewAccountDTO(String uuid, String iban) {
        this.uuid = uuid;
        this.iban = iban;
    }

    public String getUuid() { return this.uuid; }

    public String getIban() { return this.iban; }

}
