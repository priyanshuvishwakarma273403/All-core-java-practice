package TaiyariDSA.array;

public class IncreaseTripUseBoolean {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        System.out.println(increasingTriplet(arr));
     }

    private static boolean increasingTriplet(int[] arr) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int  ele : arr){
            if(ele <= first){
                first = ele;
            } else if(ele <= second){
                second = ele;
            } else{
                return true;
            }
        }
        return false;
    }
}
