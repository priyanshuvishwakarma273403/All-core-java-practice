package Practice;

public class cwh_78 {
    static void main() {
        int [] arr ={2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum =0;
        double average = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
           // average=sum/arr.length;
            average = (double)sum/arr.length;
        }
        System.out.println(sum);
        System.out.println(average);
    }
}
