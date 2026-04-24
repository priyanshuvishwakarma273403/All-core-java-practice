package TaiyariDSA.array;

public class findduplicatenegtivemarkingapproach {
    public static void main(String[] args) {
        int [] arr   = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    private static int findDuplicate(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int value = Math.abs(arr[i]);  // absolute value hamesa positive
            if(arr[value-1] > 0){
                arr[value-1] = -arr[value-1];
            } else{
                return  value;
            }
        }
        return -1;
    }
}
