package Test;

import DFS.PermutationANDCombination.Subset;

public class testSubset {
    public static void main(String[] args) {

        int[] testArr = new int[] {1,2,3,4};
        Subset subset = new Subset();
        System.out.println(subset.subsetsDFS(testArr));


        //System.out.println(subset.subsetsBFS(testArr));
        /**
         * []]
         [[], [2]]
         [[], [2], [5]]
         [[], [2], [5], [7]]
         [[], [2], [5], [7], [2, 5]]
         [[], [2], [5], [7], [2, 5], [2, 7]]
         [[], [2], [5], [7], [2, 5], [2, 7], [5, 7]]
         [[], [2], [5], [7], [2, 5], [2, 7], [5, 7], [2, 5, 7]]
         [[], [2], [5], [7], [2, 5], [2, 7], [5, 7], [2, 5, 7]]
         */
//        System.out.println(subset.subsetsWithDup(testArr));
        /**
         * [[2, 5, 7]]
         [[2, 5, 7], [2, 5]]
         [[2, 5, 7], [2, 5], [2, 7]]
         [[2, 5, 7], [2, 5], [2, 7], [2]]
         [[2, 5, 7], [2, 5], [2, 7], [2], [5, 7]]
         [[2, 5, 7], [2, 5], [2, 7], [2], [5, 7], [5]]
         [[2, 5, 7], [2, 5], [2, 7], [2], [5, 7], [5], [7]]
         [[2, 5, 7], [2, 5], [2, 7], [2], [5, 7], [5], [7], []]
         [[2, 5, 7], [2, 5], [2, 7], [2], [5, 7], [5], [7], []]
         */
    }

}
