package day40_CustomClassPractice.bank;

import day40_CustomClassPractice.bank.BankAccount;

public class BOfA {


    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setAccountInfo("Saving", "Dawud Abduwali", "123455786");

        account.getAccountInfo();

        account.deposit(1000);

        account.checkBalance();

        account.withDraw(500);

        account.checkBalance();

        account.withDraw(100000);

        account.checkBalance();


    }



}
