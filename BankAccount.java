package Encapsulation;

public class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;

    BankAccount(String name,int accountNumber,double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double money) {
        if(money > 0) {
            balance += money;
            System.out.println("Deposit successfully");
        } else
            System.out.println("Invalid amount");
    }

    void withdraw(double money) {
        if(money <= balance) {
            balance -= money;
            System.out.println("Withdraw successfully");
        } else
            System.out.println("Invalid withdraw");
    }

    double getBalance() {
        return balance;
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount("Aditya",45667567,100);
        System.out.println(account.getBalance());
        account.deposit(100);
        System.out.println(account.getBalance());
        account.withdraw(100);
        System.out.println(account.getBalance());
    }


}
