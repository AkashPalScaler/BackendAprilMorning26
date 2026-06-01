package org.example.DesignPatterns.Adapter;

import org.example.DesignPatterns.Adapter.BankAPISDKs.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIInterface{
    YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public Float getBalance(String upi) {
        return yesBankAPI.checkBalance(upi);
    }

    @Override
    public String transferAmount(String fromUPI, String toUPI, Float amount) {
        Long txnId = yesBankAPI.verifyUPIAndTransfer(fromUPI, toUPI, amount);
        return txnId.toString(); // Some conversion of both input and output might be needed
    }
}
