package Practice;
//perfect square 
import java.util.Scanner;

public class cwh_108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int root =0;
        for(int i=1;i<=n;i++){
            if(i*i>n) break;
                root=i;
        }
        System.out.println(root);
    }
}
