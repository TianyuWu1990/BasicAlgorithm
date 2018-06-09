package DFS.PermutationANDCombination;

import java.util.*;

public class Subset {
    /**
     * Given a set of distinct integers, return all possible subsets.
     */

    /**
     * BFS
     * []
     * [1] [2] [3]
     * [1, 2] [1, 3] [2, 3]
     * [1, 2, 3]
     * sort the array first, use a queue first offer each single element, then poll each one and add
     * the next element, until the queue is empty or the rest of elements are
     * smaller than the current largest element.
     */

    public List<List<Integer>> subsetsBFS(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();

        if (nums == null) {
            return results; //empty list
        }

        Arrays.sort(nums);

        //BFS
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.offer(new LinkedList<Integer>());

        while (!queue.isEmpty()) {
            List<Integer> subset = queue.poll();
            results.add(subset);
            System.out.println(results);

            for (int i = 0; i < nums.length; i++) {
                if (subset.size() == 0 || subset.get(subset.size() - 1) < nums[i]) { //check if the current value is already in the subset
                    List<Integer> nextSubset = new LinkedList<>(subset); //deep copy of current subset
                    nextSubset.add(nums[i]);
                    queue.offer(nextSubset);

                }
            }
        }
        return results;
    }

    /**
     * DFS
     */

    public List<List<Integer>> subsetsDFS(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<Integer>(), results);
        return results;
    }

    //1. definition of the recursion: put all elements in nums start from start
    // index with prefix as subset.
    private void dfs(int[] nums,
                     int start,
                     List<Integer> subset,
                     List<List<Integer>> results) {


        //3. exit of the recursion
        if (start == nums.length) {
            results.add(new ArrayList<>(subset));
            System.out.println(results);
            return;
        }

        //2. disassembly of the recursion
        //how to proceed to next level

        //add nums[start]
        subset.add(nums[start]);
        System.out.println("subset add " + nums[start]);
        dfs(nums, start + 1, subset, results);

        //do not add nums[start]
        subset.remove(subset.size() - 1);
        System.out.println("subset remove last one: ");
        dfs(nums, start + 1, subset, results);

    }

    /**
     * Given a collection of integers that might contain duplicates, S, return all possible subsets.
     * <p>
     * Note:
     * Elements in a subset must be in non-descending order.
     * The solution set must not contain duplicate subsets.
     */

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> results = new LinkedList<>();
        Arrays.sort(nums);
        helper(nums, 0, new LinkedList<Integer>(), results);
        return results;
    }

    //1. definition of the recursion: put all elements in nums start from start
    // index with prefix as subset.
    private void helper(int[] nums,
                        int start,
                        List<Integer> subset,
                        List<List<Integer>> results) {

        //3. exit of the recursion

        results.add(new LinkedList<>(subset));
        //System.out.println(results);


        //2. disassembly of the recursion
        //how to proceed to next level

        for (int i = start; i < nums.length; i++) {
            if (i != start && nums[i] == nums[i - 1]) {
                continue;
            }
            subset.add(nums[i]);
            helper(nums, i + 1, subset, results);
            subset.remove(subset.size() - 1);

        }
    }
}

