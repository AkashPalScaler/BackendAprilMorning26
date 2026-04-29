package org.example.BankAccountSync;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        BankAccount account = new BankAccount(10000000);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> res = es.submit(new DepositTask(account));
        Future<Void> res1 = es.submit(new WithdrawTask(account));

        res.get();
        res1.get();

        System.out.println("account balance : " + account.balance);
    }
}
