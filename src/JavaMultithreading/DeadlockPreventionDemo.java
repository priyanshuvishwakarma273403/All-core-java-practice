package JavaMultithreading;

class SafeTransfer{
    public void transfer(Account from , Account to , int amount) throws InterruptedException{
        Account first = from;
        Account second = to;

        if(from.getAccountNumber().compareTo(to.getAccountNumber())>0){
            first = to;
            second = from;
        }

        System.out.println(Thread.currentThread().getName()+" acquiring locks in order: "+first.getAccountNumber()+" then "+second.getAccountNumber());
        synchronized (first){
            System.out.println(Thread.currentThread().getName() +
                    " locked " + first.getAccountNumber());
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            synchronized (second){
                System.out.println(Thread.currentThread().getName() +
                        " locked " + second.getAccountNumber());

                from.debit(amount);
                to.credit(amount);

                System.out.println(Thread.currentThread().getName() +
                        " transferred Rs." + amount + " from " +
                        from.getAccountNumber() + " to " + to.getAccountNumber());


            }
        }
        System.out.println(Thread.currentThread().getName() +
                " completed transfer\n");

    }
}

class SafeTransferThread extends Thread{
    private SafeTransfer transfer;
    private Account from;
    private Account to;
    private int amount;

    public SafeTransferThread(SafeTransfer transfer, Account from, Account to, int amount,String name){
        super(name);

        this.transfer = transfer;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void run(){
        try {
            transfer.transfer(from,to,amount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class DeadlockPreventionDemo {
    public static void main(String[] args) throws InterruptedException {

        Account accountA = new Account("ACC-001",5000);
        Account accountB = new Account("ACC-002",3000);

        SafeTransfer transfer = new SafeTransfer();

        System.out.println("=== Deadlock Prevention Demo ===");
        System.out.println("Initial Balances:");

        System.out.println(accountA.getAccountNumber()+": Rs. "+accountA.getBalance());
        System.out.println(accountB.getAccountNumber() + ": Rs." +
                accountB.getBalance());
        System.out.println();

        SafeTransferThread t1 = new SafeTransferThread(transfer, accountA,
                accountB, 500, "Transfer-A-to-B");
        SafeTransferThread t2 = new SafeTransferThread(transfer, accountB,
                accountA, 300, "Transfer-B-to-A");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balances:");
        System.out.println(accountA.getAccountNumber() + ": Rs." +
                accountA.getBalance());
        System.out.println(accountB.getAccountNumber() + ": Rs." +
                accountB.getBalance());

    }
}
