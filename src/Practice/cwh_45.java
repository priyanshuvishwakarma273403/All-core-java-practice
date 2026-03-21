package Practice;

import java.util.ArrayList;

public class cwh_45 {
    public static void main(String[] args) {
        ArrayList common = new ArrayList();
        int [] arr1={21,324,43,54,65,32,45};
        int [] arr2={21,65,43,2,};
        int [] arr3={21,324,43};
        int x =0,y=0,z=0;
        while(x<arr1.length&&y<arr2.length&&z<arr3.length){
            if(arr1[x]==arr2[y]&&arr2[y]==arr3[z]){
                common.add(arr1[x]);
                x++;
                y++;
                z++;
            }
            else if(arr1[x]<arr2[y]){
                common.add(arr2[y]);
                x++;
            }
            else if(arr2[y]>arr3[z]){
                y++;
            }
            else{
                z++;
            }
        }
        System.out.println(common);
    }
}
