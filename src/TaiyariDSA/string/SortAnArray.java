package TaiyariDSA.string;

public class SortAnArray {
    public static void main(String[] args) {
        int [] arr = {5, 2, 8, 1, 3};
//        Arrays.sort(arr);  with method
//        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
    }
}
