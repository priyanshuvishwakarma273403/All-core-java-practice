package TaiyariDSA;

public class NegativePrint {
    public static void main(String[] args) {
        int [] arr = {10,-3,5,6,3,-4,-2};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
