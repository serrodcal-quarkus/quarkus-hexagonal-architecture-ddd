package com.serrodcal.application.query;

import java.util.Objects;

public class FindAccountQuery {

    private String uuid;

    public FindAccountQuery(String uuid) {
        Objects.requireNonNull(uuid, "UUID is required to find an account");

        this.uuid = uuid;
    }

    public String getUuid() {
        return this.uuid;
    }

}
