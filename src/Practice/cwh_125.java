package Practice;

public class cwh_125 {
    public static void main(String[] args) {
        int [] arr = {4,7,6,4,5,6,7};
        int a =0;
        int b = arr.length-1;
        while(a<b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;

        }
        for(int ele : arr )
        {
            System.out.print(ele+" ");
        }
    }
}
