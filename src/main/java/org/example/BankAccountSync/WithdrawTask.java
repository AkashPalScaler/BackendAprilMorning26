package org.example.BankAccountSync;

import java.util.concurrent.Callable;

public class WithdrawTask implements Callable<Void> {
    BankAccount bankAccount;

    public WithdrawTask(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public Void call() throws Exception {

        for(int i=1;i<10000;i++){
                bankAccount.withdraw(i);
        }
        return null;
    }
}
