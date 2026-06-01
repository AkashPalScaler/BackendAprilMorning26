package org.example.DesignPatterns.Adapter;

public class FastCard {
    String fastCardUPI = "fastcard@ybl";

    String rechargeCard(BankAPIInterface bankAPIInterface, String fromUPI, Float rechargeAmount){
        if(bankAPIInterface.getBalance(fromUPI) >= rechargeAmount){
            return bankAPIInterface.transferAmount(fromUPI, fastCardUPI, rechargeAmount);
        }else{
            throw new RuntimeException("Insufficient balance");
        }
    }
}
