package JavaMultithreading;

class PrinterWithClassLock{
    public void printDocument(String document,String employee){
        synchronized (PrinterWithClassLock.class) {
            System.out.println(employee + " acquired CLASS lock");
            for (int page = 1; page <= 3; page++) {
                System.out.println("Printing page " + page + " of '" +
                        document + "' for " + employee);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            System.out.println(employee + " released CLASS lock\n");
        }
    }
}

class PrinterEmployeeThread extends Thread{
    private PrinterWithClassLock printer;
    private String employeeName;
    private String document;

    public PrinterEmployeeThread(PrinterWithClassLock printer,String employeeName,String document){
        this.printer = printer;
        this.employeeName = employeeName;
        this.document = document;
    }
    public void run(){
        printer.printDocument(document,employeeName);
    }

}

public class ClassLockDemo {
    public static void main(String[] args) throws InterruptedException {
        PrinterWithClassLock printer1 = new PrinterWithClassLock();
        PrinterWithClassLock printer2 = new PrinterWithClassLock();

        PrinterEmployeeThread t1 = new PrinterEmployeeThread(printer1,"Employee-1","Doc1.pdf");
        PrinterEmployeeThread t2 = new PrinterEmployeeThread(printer2, "Employee-2", "Doc2.pdf");
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
