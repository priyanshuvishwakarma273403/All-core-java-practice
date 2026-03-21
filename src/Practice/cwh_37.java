package Practice;

public class cwh_37 {
    public static void main(String[] args) {
        int [] arr = {23,43,32,43,108,32,45};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
