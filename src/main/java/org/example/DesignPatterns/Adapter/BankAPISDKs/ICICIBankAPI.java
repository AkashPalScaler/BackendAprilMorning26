package org.example.DesignPatterns.Adapter.BankAPISDKs;

public class ICICIBankAPI {
    public Float fetchBalance(String accntNo){
        return 5000.0f;
    }

    public String getAccountAssociatedWithUPI(String UPI){
        // UPI to Account Mapping
        return "AKAS12348";
    }

    public String balanceTransfer(String fromUPI, String toUPI, Float amount){
        return "TXN34864";
    }
}
