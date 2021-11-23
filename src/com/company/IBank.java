package com.company;

import java.util.List;

public interface IBank {
    void OpenAccount(IAccount account);
    void CloseAccount(int accountNumber);
    List<IAccount> GetAllAccount();
    List <IAccount> GetAllAccountInDebt();
    List <IAccount> GetAllAccountsWithBalance(double balanceAbove);
}

