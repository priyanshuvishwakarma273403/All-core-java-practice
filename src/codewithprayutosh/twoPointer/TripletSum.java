package codewithprayutosh.twoPointer;

public class TripletSum {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        int tar = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                for(int k = j+1; k < arr.length; k++ ){
                    if(arr[i]+arr[j]+arr[k]==tar){
                        System.out.println(arr[i]+arr[j]+arr[k]);
                        return;
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Not found");
    }
}
