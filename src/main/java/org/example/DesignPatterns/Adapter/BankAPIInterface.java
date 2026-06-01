package org.example.DesignPatterns.Adapter;

public interface BankAPIInterface {
    Float getBalance(String upi);
    String transferAmount(String fromUPI, String toUPI, Float amount);
}
