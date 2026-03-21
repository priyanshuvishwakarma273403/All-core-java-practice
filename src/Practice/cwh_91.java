package Practice;

public class cwh_91 {
    public static void main(String[] args) {
        int sum=0;
        int [] [] array1={{4,2,3},{4,5,6},{3,4,5}};
        int [] [] array2={{4,2,3},{4,5,6},{3,4,5}};
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                sum+=array1[i][j];
            }
        }
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){
                sum+=array2[i][j];
            }
        }
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                sum =array1[i][j]+array2[i][j];

            }

        }
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
