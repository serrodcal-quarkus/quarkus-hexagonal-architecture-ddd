package com.serrodcal.poc.presentation.resource.exception;

public class TransactionDescriptionIsEmptyException extends RuntimeException {

    public TransactionDescriptionIsEmptyException() { super(); }

    public TransactionDescriptionIsEmptyException(String message) {
        super(message);
    }

}
