package DryPractice;

public class Arrayreverse {
    public static void main(String[] args) {
        int [] arr = {54,56,76,543,45,76,87,65,35,56};
        int n=arr.length;
        int i =0;
        int j = n-1;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
