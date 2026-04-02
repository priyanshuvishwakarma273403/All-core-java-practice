package TaiyariDSA.basicSorting;

public class pushAllZeroToEnd {
    public static void main(String[] args) {
        int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int n = arr.length;
        int j =0;
        for(int i = 0; i < n; i++){
            if(arr[i]!=0){
                if(i!=j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
