package com.elie.project;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creation du compte bancaire

        AccountBank account1 = new AccountBank("Elie","Mbuyi Kayembe",500);
        AccountBank account2 = new AccountBank("Olivier","Ngandou",200);

        account1.displayBalance();
        account1.deposit(200);
        account1.displayBalance();
        account1.withdraw(500);

        //
        account2.deposit(250);
        account2.displayBalance();
    }
}