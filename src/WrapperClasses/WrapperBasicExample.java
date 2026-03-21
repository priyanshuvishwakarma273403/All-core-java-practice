package WrapperClasses;

public class WrapperBasicExample {
    public static void main(String[] args) {
        System.out.println("===Manual Boxing===");
        int primitiveInt =100;
        Integer wrapperInt = Integer.valueOf(primitiveInt);
        System.out.println(wrapperInt);

        //Manual UnBoxing
        int backtoPrimitive =wrapperInt.intValue();
        System.out.println("Back to primitive: "+backtoPrimitive);

        System.out.println("\n====AUTO BOXING==="); //automatic change
        int num =50;
        Integer intobj = num;
        System.out.println("AutoBoxed Integer : "+intobj);

        double d =50.55;
        Double obj2 = d;
        System.out.println("AutoBoxed Double : "+obj2);

        char c ='A';
        Character obj = c;
        System.out.println("AutoBoxed Character : "+obj);

        boolean b =true;
        Boolean b1 =b;
        System.out.println("AutoBoxed Boolean : "+b1);

        System.out.println("\n===UnBoxing==="); //automatic convertion

        Integer wrapped = 200;
        int unwrapped = wrapped;
        System.out.println("Unboxed int : "+unwrapped);

        Double wrapped2 = 99.99;
        double unwrapped2 = wrapped2;
        System.out.println("Unboxed Double : "+unwrapped2);


        System.out.println("\n===AutoBoxing in Expression===");
        Integer a = 10;
        Integer b3 = 20;
        Integer sum = a+b3;
        System.out.println("Sum : "+sum);

        if(a<b3){
            System.out.println(a + " is less than "+b3);
        }

        System.out.println("\n===Null Value Heading===");
        Integer nullInt = null;
        System.out.println("Null Integer "+nullInt);

        try{
            int value = nullInt;
        }catch(NullPointerException e){
            System.out.println("NullPointerException "+e);
        }



    }

}
