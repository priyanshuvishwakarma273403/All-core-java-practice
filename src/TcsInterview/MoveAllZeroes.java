package TcsInterview;

public class MoveAllZeroes {

    public static int moveZeroes(int[] arr) {
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int [] arr = {1,0,0,2,4,5};
        System.out.println(moveZeroes(arr));
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
