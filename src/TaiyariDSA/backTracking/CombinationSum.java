package TaiyariDSA.backTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {

        int [] candidate = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidate,target));

    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }

    private static void backtrack(int idx, int[] candidates, int target,
                           List<Integer> curr, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (idx == candidates.length || target < 0) {
            return;
        }

        // Take current element
        curr.add(candidates[idx]);
        backtrack(idx, candidates, target - candidates[idx], curr, ans);
        curr.remove(curr.size() - 1);

        // Skip current element
        backtrack(idx + 1, candidates, target, curr, ans);
    }
}
