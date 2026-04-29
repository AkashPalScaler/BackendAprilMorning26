package org.example.BankAccountSync;

public class BankAccount {
    Integer balance;

    public BankAccount(Integer balance) {
        this.balance = balance;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void deposit(Integer amount){
            if(amount > 0){
                    synchronized (this){
                        balance += amount;
                    }

            }
    }

    public void withdraw(Integer amount){
            synchronized (this) {
                if (balance >= amount && amount > 0) {
                    balance -= amount;
                } else {
                    System.out.println("Withdrawal Rejected");
                }
            }
    }
}
