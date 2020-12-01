package com.serrodcal.presentation.resource.exception;

public class TransactionDescriptionIsEmptyException extends RuntimeException {

    public TransactionDescriptionIsEmptyException() { super(); }

    public TransactionDescriptionIsEmptyException(String message) {
        super(message);
    }

}
