package Test;

import BFS.NumofIslands;

public class testNumofIslands {
    public static void main(String[] args) {
        boolean[][] test = new boolean[][]{{true, true, false, false, false},
                                           {false, true, false, false, true},
                                           {false, false, false, true, true},
                                           {false, false, false, false, false},
                                           {false, false, false, false, true}};
        NumofIslands ni = new NumofIslands();
        System.out.println(ni.islandNum(test));
    }
}
