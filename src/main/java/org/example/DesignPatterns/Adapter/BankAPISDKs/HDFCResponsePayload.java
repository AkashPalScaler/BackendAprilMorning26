package org.example.DesignPatterns.Adapter.BankAPISDKs;

public class HDFCResponsePayload {
   public String txnId;
   public boolean success;

    public HDFCResponsePayload(String txnId, boolean success) {

        this.txnId = txnId;
        this.success = success;
    }
}
