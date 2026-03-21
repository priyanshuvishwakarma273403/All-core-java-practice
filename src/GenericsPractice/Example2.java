package GenericsPractice;

class Box<T> {
    private T value;
     public T getValue() {
         return value;
     }

     public void setValue(T value) {
         this.value = value;
     }
}

public class Example2 {
    public static void main(String[] args) {
        Box <Integer> box  = new Box<>();
        box.setValue(1);
        Integer value = box.getValue();  //No error
        System.out.println(value);

//        String i = (String)box.getValue();  //Exception


    }
}
