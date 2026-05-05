package TaiyariDSA.bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int n  = arr.length;
        System.out.println(subsetsProblem(arr,n));
    }

    private static  List<List<Integer>> subsetsProblem(int[] arr, int n) {
        int m = (1<<n);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i< m; i++){
            List<Integer> a = new ArrayList<>();
            for(int j = 0; j<n; j++ ){
                if((i >> j) % 2 == 1) a.add(arr[j]);
            }
            ans.add(a);
        }
        return ans;
    }
}
