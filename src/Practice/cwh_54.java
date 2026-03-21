package Practice;

public class cwh_54 {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10};
        int [] b = {1,2,3,4,5,6,7,8,9,10};
        int [] c = new int[a.length+b.length];
        for(int ele :c) System.out.print(ele+" ");
        System.out.println();
        merge(c,a,b);
        for(int ele :c) System.out.print(ele+" ");
        System.out.println();
    }

    private static void merge(int[] c, int[] a, int[] b) {
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++]= a[i++];
            else c[k++]= b[j++];
        }
        while(i<a.length) c[k++]= a[i++];
        while(j<b.length) c[k++]= b[j++];
    }
}
