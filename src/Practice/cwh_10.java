package Practice;



public class cwh_10 {
    public static void main(String[] args) {
        int [] number={3,4,2,1};
        sum(number);
    }
    public static void sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++) sum+=arr[i];
        System.out.println(sum);
    }
}
