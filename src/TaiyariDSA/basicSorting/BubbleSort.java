package TaiyariDSA.basicSorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,2,4,2,6,3,8,4,3,0};
        for (int i = 0; i < arr.length-1; i++) {
            int swap = 0;
           for(int j = 0; j < arr.length-i-1; j++){
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   swap++;
               }
           }
           if(swap == 0){
               break;
           }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
