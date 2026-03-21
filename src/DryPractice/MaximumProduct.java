package DryPractice;

public class MaximumProduct {
    public static void main(String[] args) {
        int  [] arr = { 2, 8, 5, 7, -7, 5, 8, -5 };
        int product = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(product<arr[i]*arr[j]){
                    product = arr[i]*arr[j];
                }
            }
        }
        System.out.println(product);
    }
}
