package org.example.DesignPatterns.Adapter;

import org.example.DesignPatterns.Adapter.BankAPISDKs.HDFCBankAPI;
import org.example.DesignPatterns.Adapter.BankAPISDKs.HDFCRequestPayload;
import org.example.DesignPatterns.Adapter.BankAPISDKs.HDFCResponsePayload;

public class HDFCBankAPIAdapter implements BankAPIInterface{
    HDFCBankAPI hdfcBankAPI = new HDFCBankAPI();

    @Override
    public Float getBalance(String upi) {
        return hdfcBankAPI.checkBalance(upi);
    }

    @Override
    public String transferAmount(String fromUPI, String toUPI, Float amount) {
        // Conversion of input required
        HDFCRequestPayload payload = new HDFCRequestPayload(fromUPI, toUPI, amount);
        HDFCResponsePayload response = hdfcBankAPI.transfer(payload);
        //Conversion of response is required
        if(response.success){
            return response.txnId;
        }else{
            throw new RuntimeException("Bank API Error in transfer");
        }
    }
}
