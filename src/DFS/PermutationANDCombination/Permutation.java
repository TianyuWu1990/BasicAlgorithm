package DFS.PermutationANDCombination;

import sun.font.CompositeGlyphMapper;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    /**
     *            [1,2,3]
     *              /|\
     *            [1][2][3]
     *            /\ /\ /\
     *   [1,2][1,3][2,1][2,3][3,1][3,2]
     *   /                              \
     * [1,2,3][1,3,2][2,1,3][2,3,1][3,1,2][3,2,1]
     *
     * BFS
     */



    /**
     * DFS
     */
    public List<List<Integer>> perm(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null) {
            return results;
        }
        //if nums.length == 0?


        dfs(nums, new boolean[nums.length], new ArrayList<Integer>(), results);
        return results;
    }
    //1. definition of recursion
    //find all permutations start from permutation, add to results
    private void dfs(int[] nums,
                     boolean[] visited,
                     List<Integer> permutation,
                     List<List<Integer>> results) {
        //2. exit of recursion
        if (nums.length == permutation.size()) {
            results.add(new ArrayList<>(permutation));
            return;
        }

        //3. break recursion into parts
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            //[] => [1]
            permutation.add(nums[i]);
            visited[i] = true;
            dfs(nums, visited, permutation, results);
            visited[i] = false;
            permutation.remove(permutation.size() - 1);
        }
    }
}
