package org.example.DesignPatterns.Adapter.BankAPISDKs;

public class HDFCBankAPI {
    public Float checkBalance(String UPI){
        // Actual bank API call logic
        return 2000.0f;
    }

    public HDFCResponsePayload transfer(HDFCRequestPayload payload){
        // Actual bank API call logic
        return new HDFCResponsePayload("TXN13380", true);

    }
}
