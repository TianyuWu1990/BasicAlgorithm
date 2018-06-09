package Test;

import DFS.Tree.InorderPostorderBT;

public class testInorderPostorderBT {

    public static void main(String[] args) {
        int[] in = {1,2};
        int[] post = {2,1};

        InorderPostorderBT ip = new InorderPostorderBT();
        System.out.println(ip.buildTree(in, post));
    }
}
