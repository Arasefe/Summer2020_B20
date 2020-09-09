package day48.warmup;

import java.util.Random;

/*
WarmUp tasks:
            create custom class called BankAccount for Bank of America
            public variables:  bankName, firstName, lastName
            private variables: accountHolder, accountNumber, balance
            encapsulate all the private data
                    (DO NOT USE SHORTCUT)
            create a constructor that can initialize firstName and lastName
                    (DO NOT USE SHORTCUT)
            action:
                    deposit
                    withdraw
                    availableBalance
 */
public class BankAccount {

    public String firstName;
    public String lastName;

    public BankAccount(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static String bankName ;

    static{
        bankName = "Bank of America";
    }

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        System.out.println("Depositing: $"+amount);
        balance += amount;
    }

    public void withdraw(double amount){

        if(amount <= 0 || amount > 1000){
            System.out.println("Invalid amount");
            return;
        }

        if(amount > balance ){
            System.out.println("Not enough balance");
            return;
        }

        System.out.println("Withdrawing: $"+amount);
        balance -= amount;

    }

    public void availableBalance(){
        System.out.println("Available Balance: "+getBalance());
    }

    public String toString(){
        return bankName +
                "\n==================================================="+
                "\n"+firstName + " " + lastName +
                "\nAccount Number: "+getAccountNumber()+
                "\n==================================================="+
                "\nBalance: $"+getBalance();
    }

}
class Objects {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("Aras", " YILDIRIM");
        obj1.setAccountHolder(obj1.firstName+" "+obj1.lastName);
        obj1.setAccountNumber(32823729);

        obj1.availableBalance();
        obj1.deposit(39237);
        obj1.withdraw(323);
        obj1.withdraw(344);
        System.out.println(obj1.toString());


    }
}