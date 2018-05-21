package Test;

import BFS.KnightShortestPath;

import java.awt.*;

public class testKnightShortestPath {
    public static void main(String[] args) {
        boolean[][] test = new boolean[][] {
                {false, true, false},
                {false, false, false},
                {false, false, false}};
        KnightShortestPath ksp = new KnightShortestPath();
        System.out.println(ksp.shortestPath(test, new Point(2,0), new Point(2, 2)));
    }
}
