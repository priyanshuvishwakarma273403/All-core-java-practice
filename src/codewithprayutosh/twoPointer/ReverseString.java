package codewithprayutosh.twoPointer;

public class ReverseString {

    public static void reverse(char[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverse(arr);
        for(char c : arr){
            System.out.print(c + " ");
        }

    }
}
