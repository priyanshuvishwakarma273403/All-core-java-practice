package TaiyariDSA.array;

public class FindTheLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5,7,10};
        int largest = arr[0];
        for(int ele : arr){
            if(ele>largest) largest = ele;
        }
        System.out.println(largest);
    }
}
