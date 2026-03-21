package Practice;

public class cwh_112 {
    public static void main(String[] args) {
        int [] arr = {11,5,14,18,15,3};
        int maxarrayElement = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>maxarrayElement){
                maxarrayElement=arr[i];
                System.out.println("maxarrayElement:"+maxarrayElement);
            }
        }
    }
}
