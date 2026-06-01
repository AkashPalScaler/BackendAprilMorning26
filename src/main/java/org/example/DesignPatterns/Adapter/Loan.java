package org.example.DesignPatterns.Adapter;

public class Loan {
    Float minBalanceForLoan = 1000.0f;
    boolean checkLoanEligibility(BankAPIInterface bankAPIInterface, String UPI){
        if(bankAPIInterface.getBalance(UPI) >= minBalanceForLoan){
            return true;
        }else{
            return false;
        }
    }
}
