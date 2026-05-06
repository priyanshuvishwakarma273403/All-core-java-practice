package TaiyariDSA.array;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int n = arr.length+1;
        int total = n * (n +1)/2;
        for(int ele : arr){
           total = total - ele;
        }
        System.out.println(total);
    }
}
