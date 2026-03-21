package JavaMultithreading;

class Account{
    private String accountNumber;
    private int balance;
    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount){
        balance += amount;
    }

    public void debit(int amount){
        balance -= amount;
    }
}

class DeadlockTransfer{
    public void transfer(Account from, Account to, int amount){
        System.out.println(Thread.currentThread().getName()+" trying to lock "+ from.getAccountNumber());

        synchronized (from){
            System.out.println(Thread.currentThread().getName()+" locked "+ from.getAccountNumber());

            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+" trying to lock "+ to.getAccountNumber());

            synchronized (to){
                System.out.println(Thread.currentThread().getName()+" locked "+ to.getAccountNumber());

                from.debit(amount);
                to.credit(amount);

                System.out.println(Thread.currentThread().getName()+" Transfered "+ amount);
            }
        }
    }
}

class TransferThread extends Thread{
    private  DeadlockTransfer transfer;
    private Account from;
    private Account to;
    private int amount;

    public TransferThread(DeadlockTransfer transfer, Account from, Account to, int amount,String name){
        super(name);
        this.transfer = transfer;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void run(){
        transfer.transfer(from, to, amount);
    }
}

public class DeadlockDemo {
    public static void main(String[] args) {
        Account accountA = new Account("ACC-001", 5000);
        Account accountB = new Account("ACC-002", 3000);

        DeadlockTransfer transfer = new DeadlockTransfer();

        System.out.println("=== Potential Deadlock Scenario ===\n");

        TransferThread t1 = new TransferThread(transfer,accountA,accountB,500,"transfer-A-to-B");

        TransferThread t2 = new TransferThread(transfer,accountB,accountA,300,"transfer-B-to-A");
        t1.start();
        t2.start();

        System.out.println("\nIf program hangs, deadlock occurred!");

    }
}
