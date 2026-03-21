package Practice;

public class cwh_95 {
    public static void main(String[] args) {
        int[] arr = {32, 45, 65, 76};
        int[] arr2 = {32, 45, 65, 76};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

            for (int j = 0; j < arr2.length; j++) {
                System.out.println(arr2[j]);

            }
            if(arr.length==arr2.length){
                System.out.println("Array length equal");
            }
            else{
                System.out.println("Array length not equal");
            }

        }
    }
