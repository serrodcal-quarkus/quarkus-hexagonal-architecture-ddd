package com.serrodcal.poc.presentation.resource.payload.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class CreateAccountRequestPayload {

    @Max(message="Account type needs to be between 0 and 1", value=1)
    @Min(message="Account type needs to be between 0 and 1", value=0)
    private int accountType;
    @NotBlank(message="Holder may not be blank")
    @NotNull(message="Holder is required")
    private String holder;
    @NotNull(message="Holder Birthdate is required")
    private Date holderBirthDate;
    private List<String> authorized;

    public CreateAccountRequestPayload() { }

    public CreateAccountRequestPayload(Integer accountType, String holder, Long holderBirthDate, List<String> authorized) {
        //Objects.requireNonNull(holder, "Holder is required to create an account");
        //Objects.requireNonNull(holderBirthDate, "Holder's birthdate is required to create an account");

        if (accountType != null)
            this.accountType = accountType;
        else
            this.accountType = 0;
        this.holder = holder;
        this.holderBirthDate = new Date(holderBirthDate);
        if (authorized != null && !authorized.isEmpty())
            this.authorized = new ArrayList<>(authorized);
    }

    public int getAccountType() { return this.accountType; }

    public String getHolder() {
        return this.holder;
    }

    public Date getHolderBirthDate() { return this.holderBirthDate; }

    public List<String> getAuthorized() {
        return this.authorized;
    }

    @Override
    public String toString() {
        return "CreateAccountPayload{" +
                "accountType=" + accountType +
                ", holder='" + holder + '\'' +
                ", holderBirthDate=" + holderBirthDate +
                ", authorized=" + authorized +
                '}';
    }

}
