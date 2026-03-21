package CollectionFrameworksPractice;

import java.util.HashMap;
import java.util.Map;

class Student2 {
    int id;
    String name;

    Student2(int id,String name){
        this.id=id;
        this.name=name;
    }

    public boolean equals(Object o){
        Student2 s = (Student2) o ;
        return this.id == s.id ;
    }

    public int hashCode(){
        return id;
    }

}

public class CustomKey {
    public static void main(String[] args) {
        Map<Student2,String> map = new HashMap<>();
        map.put(new Student2(1, "A"), "Java");
        map.put(new Student2(1, "B"), "Spring");
        System.out.println(map.size());

    }
}
