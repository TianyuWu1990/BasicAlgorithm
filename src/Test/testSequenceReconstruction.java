package Test;

import BFS.SequenceReconstruction;

public class testSequenceReconstruction {
    public static void main(String[] args) {
        int[] org = new int[] {1,2,3};
        int[][] seqs = {{1,2},{2,3}};
        SequenceReconstruction sr = new SequenceReconstruction();
        System.out.println(sr.sequenceReconstruction(org, seqs));
    }
}
