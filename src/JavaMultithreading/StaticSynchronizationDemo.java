package JavaMultithreading;

class SharedPrinter{
    private String printerName;
    public SharedPrinter(String printerName){
        this.printerName = printerName;
    }

    public synchronized void printDocumentInstance(String document,String employee){
        System.out.println(">>> " + employee + " started printing on " + printerName);
        for(int page = 1; page <= 3; page++){
            System.out.println(printerName + ": Printing page " + page + " of '" + document + "' for " + employee);
        try{
            Thread.sleep(300);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        }
        System.out.println("<<< " + employee + " finished printing\n");
    }
    public static synchronized void printDocumnetStatic(String printerName,String document,String employee){
        System.out.println(">>> " + employee + " started printing on " + printerName);
        for(int page = 1; page <= 3; page++){
            System.out.println(printerName + ": Printing page " + page + " of '" + document + "' for " + employee);
            try{
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("<<< " + employee + " finished printing\n");
    }
}

class EmployeeThread extends Thread{
    private String employeeName;
    private String document;
    private String printerName;
    private boolean useStaticSync;

    public EmployeeThread(String employeeName,String document,String printerName,boolean useStaticSync){
            this.employeeName = employeeName;
            this.document = document;
            this.printerName = printerName;
            this.useStaticSync = useStaticSync;
    }
    public void run(){
        if(useStaticSync){
            SharedPrinter.printDocumnetStatic(printerName, document, employeeName);

        }else{
            SharedPrinter printer = new SharedPrinter(printerName);
            printer.printDocumentInstance(document,employeeName);
        }
    }
}

public class StaticSynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== WITHOUT Static Synchronization ===");
        System.out.println("(Different objects - No coordination)\n");

        EmployeeThread e1 = new EmployeeThread("Priyanshu","Report.pdf","Printer - hr",false);
        EmployeeThread e2 = new EmployeeThread("Mary", "Invoice.pdf",
                "Printer-Finance", false);
                e1.start();
                e2.start();
                e1.join();
                e2.join();
                Thread.sleep(1000);

        System.out.println("\n=== WITH Static Synchronization ===");
        System.out.println("(Class level lock - Coordinated printing)\n");

        EmployeeThread e3 = new EmployeeThread("Alex", "Contract.pdf",
                "Printer-HR", true);
        EmployeeThread e4 = new EmployeeThread("Sara", "Budget.pdf",
                "Printer-Finance", true);

        e3.start();
        e4.start();
        e3.join();
        e4.join();

    }
}
