package com.serrodcal.application.command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CreateAccountCommand {

    private int accountType;
    private String holder;
    private Date holderBirthDate;
    private List<String> authorized;
    private Date creationDate;

    public CreateAccountCommand(int accountType, String holder, Date holderBirthDate, List<String> authorized) {
        this.accountType = accountType;
        this.holder = holder;
        this.holderBirthDate = holderBirthDate;
        if (authorized != null)
            this.authorized = new ArrayList<>(authorized);
        this.creationDate = new Date(System.currentTimeMillis());
    }

    public int getAccountType() { return this.accountType; }

    public String getHolder() { return this.holder; }

    public Date getHolderBirthDate() { return this.holderBirthDate; }

    public List<String> getAuthorized() { return this.authorized; }

    public Date getCreationDate() { return this.creationDate; }

}
