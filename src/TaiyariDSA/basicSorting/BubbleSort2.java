package TaiyariDSA.basicSorting;

public class BubbleSort2 {
    public static void main(String[] args) {
        int [] arr = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }

}
