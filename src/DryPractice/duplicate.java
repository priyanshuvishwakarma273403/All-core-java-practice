package DryPractice;

public class duplicate {
    public static void main(String[] args) {
        int arr [] = {43,56,43,56,64,78,78,54,90};
        int k=0;
        for(int i=0;i<arr.length;i++){
            boolean b=false;
            for(int j=0;j<k;j++){
                if(arr[i]==arr[j]){
                    b=true;
                    break;
                }
            }
            if(!b){
                   arr[k] =arr[i];
                    k++;
                }
            }
            for(int i=0;i<k;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }