package BFS;

import java.util.HashMap;

public class SequenceReconstruction {
    public boolean sequenceReconstruction(int[] org, int[][] seqs) {
        // write your code here
        HashMap<Integer, Integer> mapping = new HashMap<>();
        HashMap<Integer, Integer> pre = new HashMap<>();

        for (int i = 0; i < org.length; i++) {
            mapping.put(org[i], i);
        }

        for (int[] seq : seqs) {
            for (int i = 0; i < seq.length; i++) {
                if (!mapping.containsKey(seq[i])) {
                    return false;
                }
                if (i > 0 && mapping.get(seq[i - 1]) >= mapping.get(seq[i])) {
                    return false;
                }
                if (!pre.containsKey(seq[i])) {
                    if (i > 0) {
                        pre.put(seq[i], mapping.get(seq[i - 1]));
                    }
                    else {
                        pre.put(seq[i], -1);
                    }
                }
                else {
                    if (i > 0) {
                        pre.put(seq[i], Math.max(mapping.get(seq[i - 1]), pre.get(seq[i])));
                    }
                    else {
                        pre.put(seq[i], Math.max(-1, pre.get(seq[i])));
                    }
                }
            }
        }
        if (pre.size() != org.length) {
            return false;
        }
        for (int i = 0; i < org.length; i++) {
            if (pre.get(org[i]) != i - 1) {
                return false;
            }
        }
        return true;
    }
}
