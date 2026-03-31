package TaiyariDSA;

public class SecondMin {
    public static void main(String[] args) {
        int [] arr = {1,3,5,7,3,5,79,64,5,76,5,47};
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smin && arr[i] != min){
                smin=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(smin);
    }
}
