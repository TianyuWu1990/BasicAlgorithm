package BFS;

import java.util.*;

public class NumofIslands {
    public int islandNum(boolean[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int num = 0;
        for (int j = 0; j < grid.length; j++) { // j is y
            for (int i = 0; i < grid[0].length; i++) { // i is x
                if (grid[j][i]) {
                    changeGrid(grid, i, j);
                    num++;
                }
            }
        }
        return num;
    }

    public void changeGrid(boolean[][] grid, int i, int j) {
        int[] dirX = {0, 1, -1, 0};
        int[] dirY = {1, 0, 0, -1};

        int[] pair = new int[]{i, j};
        Queue<int[]> q = new LinkedList<>();
        List<int[]> visited = new ArrayList<>();
        q.offer(pair);
        grid[j][i] = false;
        System.out.println("first changed: " + j + ", " + i);
        visited.add(pair);

        while (!q.isEmpty()) {
            int[] curPair = q.poll();
            for (int n = 0; n < 4; n++) {
                int[] nextPair = new int[]{curPair[0] + dirX[n], curPair[1] + dirY[n]};
                if (!visited.contains(nextPair) && inBound(nextPair[0], nextPair[1], grid)) {
                    if (grid[nextPair[1]][nextPair[0]]) {

                        grid[nextPair[1]][nextPair[0]] = false;
                        q.offer(nextPair);
                        visited.add(nextPair);
                        System.out.println("then changed: " + nextPair[1] + ", " + nextPair[0]);
                    }

                }
            }
        }

    }

    public boolean inBound(int i, int j, boolean[][] grid) {
        return i >= 0 && j >= 0 && i < grid[0].length && j < grid.length;
    }
}
