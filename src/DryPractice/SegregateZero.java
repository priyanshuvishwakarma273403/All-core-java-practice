package DryPractice;

public class SegregateZero {
    public static void main(String[] args) {
        int []  arr = {0,1,1,0,0,0,1,1,0,1,0};
        int zero = 0;
        int one = 0;
        for(int ele : arr)
        {
            if(ele==0)
            {
                zero++;
            }
            else
            {
                one++;
            }
        }
        for(int i=0;i<zero;i++)
        {
            arr[i]=0;
            for (int j=one;j< arr.length;j++)
            {
                arr[j]=1;
            }
        }
        System.out.println(one);
        System.out.println(zero);
        System.out.println();
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }


//        int n = arr.length;
//        int i =0,j=n-1;
//        while(i<j){
//            if(arr[i]==0)
//            {
//                i++;
//            }
//            else if(arr[j]==1){
//                j--;
//            } else if (arr[i]==1 &&arr[j]==0) {
//                arr[i]=0;
//                arr[j]=1;
//                i++;
//                j--;
//            }
//        }
//        for(int ele : arr)
//        {
//            System.out.print(ele+" ");
//        }
    }
}
