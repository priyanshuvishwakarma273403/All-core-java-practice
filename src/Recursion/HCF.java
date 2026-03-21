package Recursion;

public class HCF {
//    public static int gcd(int a,int b){
//        if(a==0) return b;
//       return gcd(b%a,a);
//    }
//    public static void main(String[] args) {
//        int a = 12;
//        int b = 16;
//        System.out.println(gcd(a,b));
//    }
//    Loop se
public static void main(String[] args) {
    int a = 24 , b=60;
    System.out.println(reverse(a,b));
//    int hcf = 1;
//    for(int i=2;i<=Math.min(a,b);i++)
//    {
//        if(a%i==0&&b%i==0)
//            hcf=i;
//    }
//    System.out.println(hcf);
}
//Reverse
public static int reverse(int a,int b) {
    for (int i = Math.min(a, b); i >= 1; i--) {
        if (a%i==0&&b%i==0) {
            return i;
        }
    }
    return 0;
}
}
