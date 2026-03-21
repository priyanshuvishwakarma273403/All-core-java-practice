package Practice;

public class cwh_110 {
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,2,0,1,1,0,2,1,0,1,0,1,0,2,2,0,1,0};
        int zeroes=0;
        int ones=0;
        int twos=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                zeroes++;
            }
            if(arr[i]==1){
                ones++;
            }
            if(arr[i]==2){
                twos++;
            }
        }
        System.out.println(zeroes+" ");
        System.out.println(ones+" ");
        System.out.println(twos+" ");
        for(int i=0;i<zeroes;i++){
            arr[i]=0;
        }
        for(int j =zeroes;j<zeroes+ones;j++){
            arr[j]=1;
        }
        for(int i=zeroes+ones;i<arr.length;i++){
            arr[i]=2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
