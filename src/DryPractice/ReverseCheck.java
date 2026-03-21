package DryPractice;

public class ReverseCheck {
    public static void main(String[] args) {
        int [] arr = {32,45,67,54,34,67};
        int i =2;
        int j =4;
        while(i<j){
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
