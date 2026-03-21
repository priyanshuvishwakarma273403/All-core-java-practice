package Practice;

public class cwh_62 {
    static void main() {
        int [] arr ={32,43,54,75,73};

        int max =Integer.MIN_VALUE;
        int smax =Integer.MIN_VALUE;
        for (int i =0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        for (int i =0;i< arr.length;i++){
            if (arr[i]>smax&&arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);

    }
}
