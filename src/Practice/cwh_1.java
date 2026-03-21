package Practice;

public class cwh_1 {
    public static void main(String[] args) {
        int[] arr={-1,4,32,59,32,94,9};
        int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);

    }
}
