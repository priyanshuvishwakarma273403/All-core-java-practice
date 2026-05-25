package codewithprayutosh.mergeInterval;

import java.util.ArrayList;
import java.util.Arrays;

public class IntervalsMerge {
    public static int[][] merge(int [][] arr){
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
        ArrayList<int[]> res = new ArrayList<>();
        int n = arr.length;
        int start = arr[0][0];
        int end = arr[0][1];
        for(int i = 1; i < n; i++){
            int start2 = arr[i][0];
            int end2 = arr[i][1];

            if(end >= start2){  // merge
               end = Math.max(end,end2);
            }else{
                res.add(new int[]{start,end});
                start = start2;
                end = end2;
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int [] [] intervals = {{1,3},{2,6},{8,10},{15,18}};

        int[][] ans = merge(intervals);
        for(int[] ele:ans){
            System.out.println(Arrays.toString(ele));
        }
    }
}
