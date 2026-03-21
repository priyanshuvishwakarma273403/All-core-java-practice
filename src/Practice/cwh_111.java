package Practice;

public class cwh_111 {
    public static void main(String[] args) {
        int [] arr = {11,5,14,18,15,3};
        for(int i=0;i<arr.length;i++){
            boolean b = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    b = false;
                    break;
                }
            }
            if(b){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
