package Practice;

public class cwh_5 {
    public static void main(String[] args) {
        int [] arr ={10,10,9,3,8,3};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];


            }


        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println("smax = " + smax);
        System.out.println("max = " + max);

    }
}
