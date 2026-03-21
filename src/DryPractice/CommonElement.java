package DryPractice;
//Find common elements between two arrays Compare two arrays and print shared values.
public class CommonElement {
    public static void main(String[] args) {
        int [] arr = {45,76,67,76,87};
        int [] arr2 = {45,67,54,56,87};

        for(int i=0;i< arr.length;i++)
        {
            for(int j =0;j< arr2.length;j++)
            {
                if(arr[i]==arr2[j])
                {
                    System.out.println(arr[i]+" "+arr2[j]);
                }
            }
        }
    }
}
