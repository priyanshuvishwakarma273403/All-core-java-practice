package DryPractice;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] arr ={2,3,4,4,5,6,3};
        int k =0;
        for(int i=0;i<arr.length;i++){
            boolean b =false;
            for(int j=0;j<k;j++){
                if(arr[i]==arr[j]){
                    b=true;
                    break;
                }
            }
            if(!b){
                arr[k]=arr[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
