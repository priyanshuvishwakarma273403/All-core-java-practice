package Practice;

public class cwh_98 {
    public static void main(String[] args) {
        int [] arr ={0,1,1,2,0,0,2,1,2,1,0};
        int zeroes =0;
        int ones =0;
        int two =0;
       for(int ele:arr){
           if(ele==0){
               zeroes++;
           }
           else if(ele==1){
               ones++;
           }
           else if(ele==2){
               two++;
           }
        }
        System.out.println(zeroes);
        System.out.println(ones);
        System.out.println(two);
        for(int i=0;i<zeroes;i++){
            arr[i]=0;

        }
        for(int j =zeroes;j<two+ones+zeroes;j++){
            arr[j]=2;
        }
        for(int k=ones+two;k<arr.length;k++){
            arr[k]=1;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
