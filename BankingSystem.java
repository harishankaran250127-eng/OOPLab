package Exp6;

import java.util.Scanner;

interface BankingOperations {
    void deposit(double amount);
    void withdraw(double amount);
}

class BankAccount implements BankingOperations {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
        } else {
            balance += amount;
            System.out.println("Balance = " + format(balance));
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
            System.out.println("Balance remains " + format(balance));
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful, Balance = "
                    + format(balance));
        }
    }

    private String format(double amount) {
        if (amount == (long) amount) {
            return String.valueOf((long) amount);
        }
        return String.format("%.2f", amount);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Initial Balance = ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        while (true) {
        	System.out.println("1.Deposit");
        	System.out.println("2.Withdraw");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Deposit = ");
                    account.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Withdraw = ");
                    account.withdraw(sc.nextDouble());
                    break;

                default:
                    System.out.println("Invalid choice");
                    return;
            }
        }
    }
}