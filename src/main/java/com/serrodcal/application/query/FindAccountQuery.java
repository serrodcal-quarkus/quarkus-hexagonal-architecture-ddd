package com.serrodcal.application.query;

import java.util.Objects;

public class FindAccountQuery {

    private String uuid;

    public FindAccountQuery(String uuid) { this.uuid = uuid; }

    public String getUuid() {
        return this.uuid;
    }

}
