package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }

    private static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;
        hanoi(n-1,a,c,b);
        System.out.println(a+"-->"+c);
        hanoi(n-1,b,a,c);
    }
    public static void merge(int [] a , int [] b, int [] c) {
        int i=0;
        int j=0;
        int k = 0;
        while(i<a.length&&j<b.length){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
            }
            else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length){
            c[k++]=a[i++];
        }
        while(j<b.length) {
            c[k++] = b[j++];
        }
    }
}
