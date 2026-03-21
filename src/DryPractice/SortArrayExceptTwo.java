package DryPractice;

public class SortArrayExceptTwo {
    public static void main(String[] args) {
        int [] arr = {3,4,5,6,7,2,10};
        int [] arr1 = {4,5,6,7,3,9};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr[i]<arr[j]){
                    continue;
                }
                else if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]<arr1[j]){
                    continue;
                }
                else if(arr1[i]>arr1[j]){
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
       for(int element:arr){
           System.out.print(element+" ");
       }
        System.out.println();
       for(int element:arr1){
           System.out.print(element+" ");
       }
    }
}
