package com.serrodcal.presentation.resource.payload.response;

public class NewAccountResponsePayload {

    private String uuid;
    private String iban;

    public NewAccountResponsePayload(String uuid, String iban) {
        this.uuid = uuid;
        this.iban = iban;
    }

    public String getUuid() { return this.uuid; }

    public String getIban() { return this.iban; }

}
