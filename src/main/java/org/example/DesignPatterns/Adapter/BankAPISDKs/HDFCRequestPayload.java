package org.example.DesignPatterns.Adapter.BankAPISDKs;

public class HDFCRequestPayload {
    String fromUPI;
    String toUPI;
    Float amount;

    public HDFCRequestPayload(String fromUPI, String toUPI, Float amount) {
        this.fromUPI = fromUPI;
        this.toUPI = toUPI;
        this.amount = amount;
    }
}
