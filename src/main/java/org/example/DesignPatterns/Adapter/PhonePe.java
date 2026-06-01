package org.example.DesignPatterns.Adapter;

public class PhonePe {
    BankAPIInterface bankAPIInterface;
    Loan loan = new Loan();
    FastCard fastCard = new FastCard();
    String myUPI = "akashpal@ybl";

    public PhonePe(BankAPIInterface bankAPIInterface) {
        this.bankAPIInterface = bankAPIInterface;
    }

    void rechargeFastCard(Float amount){
        try{
            String txnId = fastCard.rechargeCard(bankAPIInterface, myUPI, amount);
            System.out.println("Recharged Successfully. TXN ID : " + txnId);
        }catch (Exception e){
            System.out.println("Failure to recharge : " + e.getMessage());
        }

    }

    void checkLoanEligibility(){
        if(loan.checkLoanEligibility(bankAPIInterface, myUPI)){
            System.out.println("Eligible for loan");
        }else{
            System.out.println("No eligible for loan");
        }
    }

}
