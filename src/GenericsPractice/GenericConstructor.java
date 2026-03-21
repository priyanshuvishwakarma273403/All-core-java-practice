package GenericsPractice;

class Test<T>{
    private T value;

//    <U> Test(U input){
//        System.out.println(input.getClass().getName());
//    }

    //Different Parameters

    <A,B> Test (A first, B second){
        System.out.println("first:"+first+" second:"+second);
    }
}

public class GenericConstructor {
    public static void main(String[] args) {
//        Test<Integer> test1 = new Test<>('c');

        new Test(10,"Ten");
        new Test(3.4,34);

    }
}
