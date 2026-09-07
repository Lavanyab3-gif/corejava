package com.practice;

class BankAccount {

    long accountNumber;
    String customerName;
    double balance;

    // Constructor
    BankAccount(long accountNumber, String customerName, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    // Deposit
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // Withdraw
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Transfer
    void transfer(BankAccount anotherAccount, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            anotherAccount.balance =
                    anotherAccount.balance + amount;

            System.out.println("Transferred Amount: " + amount);
            System.out.println("Your Balance: " + balance);
            System.out.println("Receiver Balance: "
                    + anotherAccount.balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    // Calculate Interest
    double calculateInterest(double rate) {
        return balance * rate / 100;
    }

    // Display Account Details
    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
    }
}


public class BankTest {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount(101, "Lavanya", 10000);

        BankAccount account2 =
                new BankAccount(102, "Ravi", 5000);

        System.out.println("Account 1 Details:");
        account1.display();

        System.out.println("\nAccount 2 Details:");
        account2.display();

        System.out.println("\n--- Deposit ---");
        account1.deposit(2000);

        System.out.println("\n--- Withdraw ---");
        account1.withdraw(3000);

        System.out.println("\n--- Transfer ---");
        account1.transfer(account2, 2000);

        System.out.println("\n--- Interest ---");
        double interest = account1.calculateInterest(5);
        System.out.println("Interest: " + interest);
    }
}
