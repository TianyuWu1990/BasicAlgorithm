package Test;

import DFS.PermutationANDCombination.NextPermutation;

import java.util.Arrays;

public class testNextPermutation {
    public static void main(String[] args) {
        int[] testarr = new int[] {1,2,3,4};
        NextPermutation np = new NextPermutation();
        for (int i = 0; i < 10; i++) {
            np.nextPermutation((testarr));
            System.out.println(Arrays.toString(testarr));
        }

    }

}
