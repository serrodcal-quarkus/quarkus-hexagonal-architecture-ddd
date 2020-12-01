package com.serrodcal.poc.application.query;

public class GetBalanceQuery {

    private String uuid;

    public GetBalanceQuery(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() { return this.uuid; }

}
