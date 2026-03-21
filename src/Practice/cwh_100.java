package Practice;

public class cwh_100 {
    public static void main(String[] args) {
        int [] arr = {34,54,23,45,23,55,67,89};
        int n = arr.length;
        print(arr);

        for(int i=0;i<n;i++){
            int min =Integer.MIN_VALUE;
            int mindx = -1;
            for(int j=i;j<n;j++){
                if(arr[j]>min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        print(arr);
    }
    private static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
