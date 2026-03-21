package Practice;

public class cwh_57 {
    public static void main(String[] args) {
        int [] x={21,34,45,54};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
//        System.out.println();
    }

    private static void change(int[] x) {
        x[2]=99;
    }
}
