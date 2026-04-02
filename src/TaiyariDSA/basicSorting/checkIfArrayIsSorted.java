package TaiyariDSA.basicSorting;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {10,30,20,40,50};
        boolean flag = true;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
