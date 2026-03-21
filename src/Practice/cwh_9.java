package Practice;
class Student {
    String name;
    int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class cwh_9 {
    public static void main(String[] args) {
        Student [] arr;
        arr = new Student[5];
        arr[0]=new Student("Vaibhav",1);
        arr[1]=new Student("Vaibhav",1);
        arr[2]=new Student("Vaibhav",1);
        arr[3]=new Student("Vaibhav",1);
        arr[4]=new Student("Vaibhav",1);
        for(int i=0;i<5;i++) System.out.println(i+" "+arr[i].name+":"+arr[i].age);
        System.out.println(arr[7]);

    }
}
