package TwoDArray;

public class sort {
    public static void main(String[] args) {
        int [] arr = {0,2,2,1,1,0,0,2,1};
        print(arr);
        for(int num:arr)
        {
            System.out.print(num+" ");
        }
        print(arr);
        for(int num:arr)
        {
            System.out.println(num+" ");
        }
    }

    private static void print(int[] arr) {
        int min=0,mid =0,high=arr.length-1;
        while(mid<high)
        {
            switch (arr[mid]){
                case 0:{
                    int temp=arr[min];
                    arr[min]=arr[mid];
                    arr[mid]=temp;
                    mid++;
                    mid++;
                    break;


                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
                }
            }
        }
    }
}
