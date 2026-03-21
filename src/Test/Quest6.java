package Test;

import java.util.Scanner;

class Bankaccount {
    private String BankName;
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private int accountPin;
    private String createAccount;

    public Bankaccount(String accountHolder, String accountNumber, double balance, int accountPin, String BankName, String createAccount) {
        this.BankName = BankName;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.createAccount = createAccount;

        this.accountPin = accountPin;


        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        }
        if (balance > 0) {
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Balance cannot be negative . set balance 0");
        }

    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            }
            if (balance > amount) {
                System.out.println("Withdraw Successful");
            } else {
                System.out.println("Insufficient balance");
            }


        } else {
            System.out.println("Withdrawal amount must be positive");
        }

    }


    public void checkBalance() {
        System.out.println("Current balance is " + balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccountPin() {
        return accountPin;
    }


}




public class Quest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //   Bankaccount bank = new Bankaccount();
        while(true){
            System.out.println("\n======Banking System======");
            System.out.println("1.  Create Account");
            System.out.println("3.  Deposit Account");
            System.out.println("2.  Withdraw Account");
            System.out.println("4.  Check Balance");
            System.out.println("5.  Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter name:");
                    String name = sc.next();
                    System.out.println("Enter account number:");
                    String accountNumber = sc.next();
                    System.out.println("Enter balance:");
                    double balance = sc.nextDouble();
                    System.out.println("Enter account pin:");
                    int accountPin = sc.nextInt();


                  break;
                 case 2:

            }
        }
    }
}
