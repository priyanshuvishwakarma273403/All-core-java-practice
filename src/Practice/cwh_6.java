package Practice;

public class cwh_6 {
    public static void main(String[] args) {
        int [] arr = {10,28,49,83,26,43,32,54,76};
        int n = arr.length;

        int a = 0 ,b=n-1;
        for(int i=0;i<n;i++){
            int temp =arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }


    }
}




















   // }
//        int [] arr = {10,4,54,54,23,65,76};
//        int n=arr.length;
//        int a =0,b=n-1;
//        while(a<b){
//            int temp=arr[a];
//            arr[a]=arr[b];
//            arr[b]=temp;
//            a++;
//            b--;
//
//        }
//        for( int ele : arr)
//        {
//            System.out.print(ele+" ");
//        }
//
//
//    }
//}
