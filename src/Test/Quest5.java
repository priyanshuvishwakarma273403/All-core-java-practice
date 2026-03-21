package Test;
class student{
    String name;
    String grade ;
    String activity;
    student(String name,String grade,String activity){
        this.name=name;
        this.grade=grade;
        this.activity=activity;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Grade:"+grade);
        System.out.println("Activity:"+activity);
    }

}
public class Quest5 {
    public static void main(String[] args) {
        System.out.println("Welcome to StudentFee System");
        student s1 = new student("Vaibhav","A","Boxing,Dancing,Playing,");
        s1.display();
        
    }
}
