package com.serrodcal.domain.account;

// International Bank Account Number
public class IBAN {

    // Spain: ES12 1234 1234 12 1234567890

    private String countryCode; // ES
    private String checkNumber; // 12
    private String bankIdentifier; // 1234 1234
    private String sortCode; // 12
    private String accountNumber; // 1234567890

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
