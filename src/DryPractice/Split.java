package DryPractice;
//Split array into two halves Divide the array into two equal parts and print both.
public class Split {
    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,7,8,9};
        int i =0;
        for(i=0;i< arr.length/2;i++)
        {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        for(int j = arr.length/2;j< arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
