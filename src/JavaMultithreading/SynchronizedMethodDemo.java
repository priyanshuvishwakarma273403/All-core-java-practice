package JavaMultithreading;

class SafeBankAccount{
    private int balance =1000;

    public int getBalance(){
        return balance;
    }

    public synchronized void withdrwal(int amount){
        System.out.println(Thread.currentThread().getName()+" acquired lock on account");

        if(balance>=amount){
            System.out.println(Thread.currentThread().getName()+" is going to  withdrawal: " + amount);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                    throw new RuntimeException(e);
            }
            balance -=amount;
            System.out.println(Thread.currentThread().getName()+" completed withdrawal Balance: " + balance);
        }
        else{
            System.out.println("Insufficient balance "+Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().getName()+" release lock ");
    }

    public synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+" depositing "+amount);
        balance +=amount;
        System.out.println("Balance after deposit : "+balance);
    }
}

class SafeATMThread extends Thread{
    private SafeBankAccount account;
    private int withdrawAmount;

    public SafeATMThread(SafeBankAccount account, int withdrawAmount,String name){
        super(name);
        this.account = account;
        this.withdrawAmount = withdrawAmount;
    }

    public void run(){
        account.withdrwal(withdrawAmount);
    }
}


public class SynchronizedMethodDemo {
    public static void main(String[] args) {
        SafeBankAccount account = new SafeBankAccount();
        System.out.println("Initial Balance: " + account.getBalance());
        System.out.println("================================");

        SafeATMThread atm1 = new SafeATMThread(account,1000,"Atm delhi");
        SafeATMThread atm2 = new SafeATMThread(account,1000,"Atm Mumbai");

        atm1.start();
        atm2.start();

        try{
            atm1.join();
            atm2.join();
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("================================");
        System.out.println("Final Balance: " + account.getBalance());
    }
}
