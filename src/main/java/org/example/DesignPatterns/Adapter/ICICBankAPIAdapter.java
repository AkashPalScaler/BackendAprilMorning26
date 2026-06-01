package org.example.DesignPatterns.Adapter;

import org.example.DesignPatterns.Adapter.BankAPISDKs.ICICIBankAPI;

public class ICICBankAPIAdapter implements BankAPIInterface{
    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();
    @Override
    public Float getBalance(String upi) {
        String accntNo = iciciBankAPI.getAccountAssociatedWithUPI(upi); // Sometimes output must be converted before calling
        return iciciBankAPI.fetchBalance(accntNo);
    }

    @Override
    public String transferAmount(String fromUPI, String toUPI, Float amount) {
        return iciciBankAPI.balanceTransfer(fromUPI, toUPI, amount);
    }
}
