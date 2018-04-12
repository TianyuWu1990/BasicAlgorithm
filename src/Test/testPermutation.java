package Test;

import DFS.PermutationANDCombination.Permutation;

import java.util.Arrays;

public class testPermutation {
    public static void main(String[] args) {
        Permutation pm = new Permutation();
        int[] testArray = new int[10];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int)(Math.random()*1000);
        }
        System.out.println(Arrays.toString(testArray));
        System.out.println(pm.perm(testArray).toString());
    }
}
