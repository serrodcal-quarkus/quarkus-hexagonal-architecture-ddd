package com.serrodcal.presentation.resource.payload.request;

import com.serrodcal.shared.util.CurrencyUtil;

import javax.validation.constraints.*;
import java.util.Date;

public class MakeTransactionRequestPayload {

    // Could be an UUID or an IBAN, depending on the kind of transaction
    @NotNull(message = "Account may not be null")
    @NotBlank (message = "Account may not be blank")
    private String account;
    @NotNull(message = "Description may not be null")
    @NotBlank (message = "Description may not be blank")
    private String description;
    // Signed
    @NotNull(message = "Amount may not be null")
    private Double amount;
    // ISO 4217; Euro by default
    private String currency;
    @PastOrPresent(message = "Date may not be future")
    private Date date;

    public MakeTransactionRequestPayload() { }

    public MakeTransactionRequestPayload(String account, String description, Double amount, String currency, Long date) {
        this.account = account;
        this.description = description;
        this.amount = amount;
        if (currency != null)
            this.currency = currency;
        else
            this.currency = CurrencyUtil.getEURO();
        this.date = new Date(date);
    }


    public String getAccount() { return this.account; }

    public String getDescription() { return this.description; }

    public Double getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Date getDate() { return this.date; }

    @Override
    public String toString() {
        return "MakeTransactionPayload{" +
                "account='" + account + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", date=" + date +
                '}';
    }

}
