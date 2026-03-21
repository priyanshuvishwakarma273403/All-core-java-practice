package Practice;

public class cwh_87 {
    public static void main(String[] args) {
        int [] arr ={54,67,64,43,67,88};
        int[] number = arr;
        number[0]=-100;
        number[1]=10;
       for(int i: number){
           System.out.print(i+" ");
       }
    }
}
