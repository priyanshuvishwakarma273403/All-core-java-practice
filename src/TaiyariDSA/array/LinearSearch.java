package TaiyariDSA.array;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {10,2,4,5,8,4,2};
        int found = 19;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==found){
                System.out.println("Element found at index "+i+" at position "+found);
            }
            else{
                System.out.println("Element not found ");
            }
            return;
        }
    }
}
