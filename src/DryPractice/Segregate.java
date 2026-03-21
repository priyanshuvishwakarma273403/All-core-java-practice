package DryPractice;

public class Segregate {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0};
        int countZeroes = 0;
        int countones = 0;
        for (int i : arr) {
            if (i == 0) {
                countZeroes++;
            } else {
                countones++;
            }
        }
        System.out.println(countZeroes);
        System.out.println(countones);
        for (int i = 0; i < countZeroes; i++) {
            arr[i] = 0;
            for(int j =countZeroes;j<arr.length;j++){
                arr[j]=1;
            }
        }
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
