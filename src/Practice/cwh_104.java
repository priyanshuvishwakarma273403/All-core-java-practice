package Practice;
/// insertion sort
public class cwh_104 {
    public static void main(String[] args) {
        int [] arr = {54,65,76,3,54,77,96};
        int n = arr.length;
        for(int i =0;i<n;i++)
        {
            int j =i;
            while(j>0 &&arr[j]<arr[j-1])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for(int ele : arr)
            {
            System.out.print(ele+" ");
            }
    }
}
