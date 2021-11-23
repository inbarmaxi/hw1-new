package com.company;

public class StandardAccount implements IAccount{
    public  double currentBalance;
    public int accountNumber;
    public double creditlimit;

    public StandardAccount(int accountNumber, double creditlimit)
    {
        this.currentBalance =0;
        this.accountNumber = accountNumber;
        this.creditlimit = creditlimit;
    }
    @Override
    public void Deposit(double amount) {
        // TODO Auto-generated method stub
        currentBalance = currentBalance + amount;
    }

    @Override
    public double Withdraw(double amount) {
        // TODO Auto-generated method stub
        if (amount>currentBalance-creditlimit&&currentBalance != creditlimit) {
            double total = currentBalance - creditlimit;
            currentBalance =  currentBalance - total;
            return total;
        }
        else if (currentBalance == creditlimit)
            return 0;
        else
        {
            currentBalance =currentBalance - amount;
            return amount;
        }
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

