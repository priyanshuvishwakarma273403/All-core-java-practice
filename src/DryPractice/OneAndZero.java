package DryPractice;

public class OneAndZero {
    public static void main(String[] args) {
        int [] arr = {0,1,1,0,1,0,1};
        int one =0;
        int zero=0;
        for(int ele : arr){
            if(ele==0){
                one++;
            }
            else{
                zero++;
            }
        }
        System.out.println(one);
        System.out.println(zero);
        System.out.println();
        for(int i=0;i<one;i++){
            arr[i]=1;
        }
        for(int i=one;i< arr.length;i++){
            arr[i]=0;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
