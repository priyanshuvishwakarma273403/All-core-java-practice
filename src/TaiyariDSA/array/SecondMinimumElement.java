package TaiyariDSA.array;

public class SecondMinimumElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);

        int smin = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < smin &&  arr[i]!=min){
                smin = arr[i];
            }
        }
        System.out.println(smin);
    }
}
