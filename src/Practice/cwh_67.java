package Practice;

public class cwh_67 {
    public static void equality_checking(int[] arr, int[] arr2){
        boolean flag = true;
        if(arr.length==arr2.length){
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=arr2[i]){
                    flag = false;
                }
            }
        }
        else {flag = false;}
        if(flag){
            System.out.println("Two arrays are equal");
        }
        else{System.out.println("Two arrays are not equal");}
    }
    static void main() {
        int [] arr ={2,4,3,5,3};
        int [] arr2 ={2,4,6,5,3};
        int [] arr1 ={2,4,3,5,3};
        equality_checking(arr,arr2);
        equality_checking(arr1,arr2);
    }
}
