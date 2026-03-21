package JavaMultithreading;

public class BankAccount {
    private int balance =1000;

    public synchronized void withdrawl(int amount){
        if(balance>=amount){
            System.out.println(Thread.currentThread().getName() + " is withdrawing $"+amount);
            balance -=amount;
            System.out.println("Remaining $"+balance);
        }
    }
    public synchronized  int getBalance(){
        return balance;
    }
}

class unsafeAccount{
    private int balance;

    public void withdrawl(int amount){
        if(balance>=amount){
            balance -=amount;
        }
    }
    public int getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        unsafeAccount unsafeAccount = new unsafeAccount();
        bankAccount.withdrawl(500);
        bankAccount.withdrawl(500);
        unsafeAccount.withdrawl(500);
        unsafeAccount.getBalance();
        bankAccount.getBalance();
    }
}
