package example.java.algorithms.paradigm.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        findAllCombinations(candidates,0, candidates.length, target, path, res);
        return res;
    }

    public void findAllCombinations(int[] candidates, int start, int end, int target, List<Integer> path,
                                    List<List<Integer>> res) {
        for(int i=start; i<end; i++) {
            if(candidates[i]>target) {
                break;
            }
            if(i<end-1 && candidates[i] == candidates[i+1])
                continue;
            path.add(candidates[i]);
            if(candidates[i]==target) {
                res.add(path);
                return;
            } else if(candidates[i]<target) {
                path.add(candidates[i]);
                findAllCombinations(candidates, i+1, end, target-candidates[i], path, res);
            }
        }
    }
}
