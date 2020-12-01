package com.serrodcal.domain.account;

import java.util.Date;
import java.util.List;

public class Account {

    private String uuid;
    private NIF holder;
    private IBAN iban;
    private AccountType type;
    private Double balance;
    private Date creationDate;
    private List<NIF> authorized;

    // TODO: define the methods

}
