package org.example.DesignPatterns.Adapter.BankAPISDKs;

public class YesBankAPI {
    public Float checkBalance(String UPI){
        // Actual bank API call logic
        return 2000.0f;
    }

    public Long verifyUPIAndTransfer(String fromUPI, String toUPI, Float amount){
        // Actual bank API call logic
        return 123982131L;
    }
}
