package Test;
class Student1{
    private String name;
    private int rollNumber;
   private int sub1,sub2,sub3,sub4,sub5;
   Student1(String name,int rollNumber,int sub1,int sub2,int sub3,int sub4,int sub5){
       this.name=name;
        this.rollNumber=rollNumber;
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
        this.sub5=sub5;

   }
   public int calculatetotal(){
       return sub1+sub2+sub3+sub4+sub5;
   }
   public double calculateAverage()
   {
       return calculatetotal()/5;
   }
   public char calculatecgrade() {
       double avg = calculateAverage();
       if (avg >= 90) {
           return 'A';
       } else if (avg >= 80) {
           return 'B';
       } else if (avg >= 70) {
           return 'C';
       } else if (avg >= 60) {
           return 'D';
       } else if (avg >= 50) {
           return 'F';
       }
       return 'E';
   }
   public void display(){
       System.out.println("====Student Details====");
       System.out.println("Name is "+name);
       System.out.println("Roll Number is "+rollNumber);
       System.out.println("Sub1 is "+sub1);
       System.out.println("Sub2 is "+sub2);
       System.out.println("Sub3 is "+sub3);
       System.out.println("Sub4 is "+sub4);
       System.out.println("Sub5 is "+sub5);
       System.out.println("Total is "+calculatetotal());
       System.out.println("Average is "+calculateAverage());
       System.out.println("Grade is "+calculatecgrade());
       System.out.println();

   }
}
public class chw_7 {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Priyanshu ",15,90,98,76,54,76);
        Student1 s2 = new Student1("Prateek",14,56,98,98,87,76);
        Student1 s3 = new Student1("Gaurav",14,56,98,98,87,76);
        Student1 s4 = new Student1("Raghav",14,56,98,98,87,76);
        s1.display();
        s1.calculatetotal();
        s1.calculatecgrade(); //PRIYANSHU
        s2.display();
        s2.calculatetotal();
        s2.calculatecgrade();//PRATEEK
        s3.display();
        s3.calculatetotal();
        s3.calculatecgrade(); //GAURAV
        s4.display();
        s4.calculatetotal();
        s4.calculatecgrade();//RAGHAV




    }
}