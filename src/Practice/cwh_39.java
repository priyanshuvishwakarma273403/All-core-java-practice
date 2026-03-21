package Practice;

public class cwh_39 {
    public static void main(String[] args) {
        int [] arr ={0,1,1,1,1,0,0,0,0,1,0,1,0,1,0};
        int numberofzero =0;
        int numberofone=0;
        for(int ele :arr) {
            if (ele == 0) numberofzero++;
            numberofone++;
        }
        for(int i=0;i<numberofzero;i++){
            arr[i]=0;
        }
        for(int i=numberofzero;i< arr.length;i++){
            arr[i]=1;
        }
        System.out.println(numberofzero);

    }
}
