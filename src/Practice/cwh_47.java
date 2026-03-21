package Practice;

public class cwh_47 {
    public static void main(String[] args) {
        printFrom(1);
    }
    public static void printFrom(int num){
        if(num>100) return;
        System.out.println(num);
        printFrom(num+1);
    }
}
