package Test;
class Student {
   private static String name ="Apj abdul kalam university";
   private static int rollno=1;
           private String StuName;
   Student(String StuName){
   this.StuName=StuName;

   }
   void display(){
       System.out.println("College name"+name);
       System.out.println("Student Name:"+StuName);
       System.out.println("Roll no:"+rollno);
       System.out.println();
   }
}


public class Quest13 {
public   static void main(String[] args) {
        Student s1 = new Student("Chodhary");
        s1.display();
        Student s2 = new Student("Kalpesh");
        s2.display();
        Student s3 = new Student("Nitesh");
        s3.display();
        Student s4 = new Student("Gopal");
        s4.display();
        Student s5 = new Student("Golu");
        s5.display();

    }
}
