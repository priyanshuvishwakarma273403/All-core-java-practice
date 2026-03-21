package Practice;

public class cwh_79 {
    static void main() {
        int [][] [] arr = {{{3,4,3},{3,7,6,3},{6}},{{ 2,4,5},{1},{43,2,4,3}}};
//        System.out.println("Length of the row is"+arr[0].length);
//        System.out.println("Length of the column is"+arr[1].length);
//        System.out.println("Length of the column is"+arr[2].length);
//        for(int i=0;i<arr.length;i++)
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]);
//            }
//        for(int [] ele :arr){
//            for(int ele1 : ele){
//                System.out.println(ele1);
//            }
//        }
        for(int [] [] ele:arr)
        {
            for(int [] ele1 :ele){
                for(int ele2 : ele1){
                    System.out.println(ele2);

                }
            }
        }
    }
}
