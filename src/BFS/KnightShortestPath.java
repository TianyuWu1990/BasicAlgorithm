package BFS;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KnightShortestPath {
    public int shortestPath(boolean[][] grid, Point source, Point destination) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }

        int step = 0;
        Queue<Point> q = new LinkedList<>();
        q.offer(source);
//        ArrayList<Point> visited = new ArrayList<>();
//        visited.add(source);

        int[] x = {1,1,-1,-1,2,2,-2,-2};
        int[] y = {2,-2,2,-2,1,-1,1,-1};

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Point cur = q.poll();
                if (cur.x == destination.x && cur.y == destination.y) {
                    return step;
                }
                for (int index = 0; index < 8; index++) {
                    //inbound means on board and not blocked
                    if (inBound(cur.x + x[index], cur.y + y[index], grid)) {
                        Point next = new Point();
                        next.x = cur.x + x[index];
                        next.y = cur.y + y[index];
                        q.offer(next);
                        grid[next.x][next.y] = true;
                    }
                }
            }
            step++;
        }



        return -1;
    }

    private boolean inBound(int x, int y, boolean[][] grid) {
        if (x < grid.length && x >= 0) {
            if(y < grid[0].length && y >= 0) {
                if (!grid[x][y]) {
                    return true;
                }
            }
        }
        return false;
    }
}
