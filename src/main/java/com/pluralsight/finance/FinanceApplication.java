package com.pluralsight.finance;

import com.pluralsight.BankAccount;
import com.pluralsight.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", 123, 12500);
        Valuable account2 = new BankAccount("Gary", 456, 1500);

//        Deposit money
        account1.deposit(100);
        account2.deposit(100);
    }
}
