package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank  implements IBank{
    public List<IAccount> accounts;

    public Bank() {
        accounts = new ArrayList<IAccount>();
    }

    @Override
    public void OpenAccount(IAccount account) {
        accounts.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        int i;
        boolean found = false;
        for (i=0;i<accounts.size();i++) {
            if (accounts.get(i).GetAccountNumber() == accountNumber)
            {
                if (accounts.get(i).GetCurrentBalance()>0)
                {
                    accounts.remove(i);
                    System.out.println("The account deleted succesfully");

                }
                else
                    System.out.println("The account couldnt be deleted");
                found = true;
            }
        }
        if (found ==  false)
            System.out.println("The account couldnt be found");
    }

    @Override
    public List<IAccount> GetAllAccount() {
        // TODO Auto-generated method stub
        return accounts;
    }

    @Override
    public List<IAccount> GetAllAccountInDebt() {
        List <IAccount> negativeAccount = new ArrayList <IAccount>();
        int i;
        for (i=0;i<accounts.size();i++) {
            if (accounts.get(i).GetCurrentBalance()<0)
                negativeAccount.add(accounts.get(i));
        }
        return negativeAccount;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List <IAccount> biggerBalance = new ArrayList <IAccount>();
        int i;
        for(i=0;i<accounts.size();i++) {
            if (accounts.get(i).GetCurrentBalance() >balanceAbove)
                biggerBalance.add(accounts.get(i));
        }
        return biggerBalance;
    }
}

