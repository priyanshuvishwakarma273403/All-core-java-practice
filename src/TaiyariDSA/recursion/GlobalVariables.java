package TaiyariDSA.recursion;

public class GlobalVariables {
    static int x = 10;

    public static void main(String[] args) {

        x = 9;
        System.out.println(x);

        int x = 4;
        System.out.println(x);

        x= 6;
        System.out.println(x);

        fun();

    }
    public static void fun(){
        x = 20;
        System.out.println(x);
    }
}
