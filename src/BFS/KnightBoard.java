package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class KnightBoard {
    public double knightProbability(int N, int K, int r, int c) {
        int[][] directions = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{r, c});
        int level = 1;
        if (K == 0) {
            return 1;
        }
        while (queue.size() > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                System.out.println("poll one");
                for (int j = 0; j < directions.length; j++) {
                    int[] direction = directions[j];
                    int x = curr[0] + direction[0];
                    int y = curr[1] + direction[1];
                    if (x >= 0 && x < N && y >= 0 && y < N) {
                        queue.offer(new int[]{x, y});
                        System.out.println("offer one");
                    }
                }
            }
            if (level == K) {
                double prob = queue.size();
                for (int i = 0; i < K; i++) {
                    prob = prob / 8;
                }
                return prob;
            }
            level++;
        }
        return 0;
    }
}

