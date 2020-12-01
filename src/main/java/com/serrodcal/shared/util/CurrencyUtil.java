package com.serrodcal.shared.util;

// ISO 4217, see: https://en.wikipedia.org/wiki/ISO_4217
public class CurrencyUtil {

    private static final String EURO = "EUR";
    private static final String US_DOLLAR = "USD";

    public static String getEURO() {
        return EURO;
    }

    public static String getUsDollar() {
        return US_DOLLAR;
    }

}
