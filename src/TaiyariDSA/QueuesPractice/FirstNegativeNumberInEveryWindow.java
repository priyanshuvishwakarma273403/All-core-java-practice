package TaiyariDSA.QueuesPractice;

//Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
//Output: [-8, 0, -6, -6]
//Explanation:
//Window [-8, 2] First negative integer is -8.
//Window [2, 3] No negative integers, output is 0.
//Window [3, -6] First negative integer is -6.
//Window [-6, 10] First negative integer is -6.


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNumberInEveryWindow {
    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(firstNegInt(arr,k));
    }

    private static List<Integer> firstNegInt(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] < 0) q.add(i);
        }
        for(int i = 0; i< n-k+1; i++){

            // window is from i to i+k-1
            while(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 && q.peek()<=i+k-1) ans.add(arr[q.peek()]);
            else ans.add(0);
        }
        return ans;
    }
}
