package com.cydeo.exception;

public class BalanceNotSufficentException extends RuntimeException {
    public BalanceNotSufficentException(String message) {
        super(message);
    }
}
