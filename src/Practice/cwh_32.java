package Practice;

public class cwh_32 {
    public static void main(String[] args) {
        int[] arr ={43,45,43,54,45,54,76,87,65};  //Dublicate value
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]&&(i!=j)){
                    System.out.print("Dublicate value"+" "+arr[j]);
                }
            }
        }
    }
}
