package com.mehdi.ebankbackend.exceptions;

public class BalanceNotSufficientException extends Exception{
    public BalanceNotSufficientException(String message) {
        super(message);
    }
}
