package Practice;

public class cwh_75 {
    static void main() {
        int arr[] = {0,1,43,0,43,56,0,45,860,76,0,76,0};


        for(int i=0;i<arr.length-1;i++){
            int swap =0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;

                }

            }
            if(swap==0){
                break;
            }
        }
        System.out.println();
    }
}
