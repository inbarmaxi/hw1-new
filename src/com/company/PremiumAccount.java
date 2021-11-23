package com.company;

import java.util.List;

public class PremiumAccount implements IAccount {

    public double currentBalance;
    public int accountNumber;
    public PremiumAccount (int accountNumber) {
        this.accountNumber = accountNumber;
        currentBalance = 0;
    }
    @Override
    public void Deposit(double amount) {
        currentBalance = currentBalance +amount;

    }
    @Override
    public double Withdraw(double amount) {
        // TODO Auto-generated method stub
        currentBalance = currentBalance -amount;
        return amount;
    }
    @Override
    public double GetCurrentBalance() {
        // TODO Auto-generated method stub
        return currentBalance;
    }
    @Override
    public int GetAccountNumber() {
        // TODO Auto-generated method stub
        return accountNumber;
    }
}


