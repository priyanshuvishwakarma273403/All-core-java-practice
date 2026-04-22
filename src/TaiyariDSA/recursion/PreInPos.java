package TaiyariDSA.recursion;

public class PreInPos {
    public static void main(String[] args) {
        pip(3);
    }

    private static void pip(int n) {
        if(n==0) return;
        System.out.println("pre " +n+ " ");
        pip(n-1);
        System.out.println("In " +n+ " ");
        pip(n-1);
        System.out.println("post " +n+ " ");
    }
}
