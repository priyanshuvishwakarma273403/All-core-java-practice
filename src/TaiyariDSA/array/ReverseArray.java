package TaiyariDSA.array;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {10,2,4,66,8,64,79,4};
        int i = 0 , j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int element : arr) {
            System.out.print(element + " ");
        }
    }
}
