package org.example.DesignPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new YesBankAPIAdapter());
        phonePe.checkLoanEligibility();
        phonePe.rechargeFastCard(100f);
    }
}
