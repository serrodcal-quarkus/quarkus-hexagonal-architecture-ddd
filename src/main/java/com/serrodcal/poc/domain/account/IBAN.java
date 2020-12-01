package com.serrodcal.poc.domain.account;

// International Bank Account Number
public class IBAN {

    private String countryCode;
    private String checkNumber;
    private String bankIdentifier;
    private String sortCode;
    private String accountNumber;

    public IBAN() { }

    public IBAN(String countryCode, String checkNumber, String bankIdentifier, String sortCode, String accountNumber) {
        this.countryCode = countryCode;
        this.checkNumber = checkNumber;
        this.bankIdentifier = bankIdentifier;
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public String getCountryCode() { return this.countryCode; }

    public String getCheckNumber() { return this.checkNumber; }

    public String getBankIdentifier() { return this.bankIdentifier; }

    public String getSortCode() { return this.sortCode; }

    public String getAccountNumber() { return this.accountNumber; }

    @Override
    public String toString() {
        return "IBAN{" +
                "countryCode='" + countryCode + '\'' +
                ", checkNumber='" + checkNumber + '\'' +
                ", bankIdentifier='" + bankIdentifier + '\'' +
                ", sortCode='" + sortCode + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }

}
