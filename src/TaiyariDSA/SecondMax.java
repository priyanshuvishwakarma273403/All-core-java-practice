package TaiyariDSA;

public class SecondMax {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,74,75,7,76,47,};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println();
        int smax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
