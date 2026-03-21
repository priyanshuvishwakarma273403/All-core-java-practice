package Practice;


public class cwh_59 {
    public static void main(String[] args) {
        int [] arr ={32,43,54,75,73};
        print(arr);
        for(int i=0;i<arr.length;i++){
            if(i%2==0)arr[i]*=2;
            else arr[i]+=10;
        }
        print(arr);


    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
