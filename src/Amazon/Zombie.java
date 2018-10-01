//public class Solution {
//    /**
//     * @param grid: a 2D integer grid
//     * @return: an integer
//     */
//    public int zombie(int[][] grid) {
//        // write your code here
//        if (grid.length == 0 || grid[0].length == 0 || grid == null) {
//            return 0;
//        }
//        int remain = 0;
//        Queue<int[]> q = new LinkedList<new int[2]>();
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 0) {
//                    remain++;
//                }
//                else if (grid[i][j] == 1) {
//                    q.offer(new int[]{i, j});
//                }
//            }
//        }
//        if (remain == 0) return 0;
//        int day = 0;
//        int[] magicX = {1, -1, 0, 0};
//        int[] magicY = {0, 0, 1, -1};
//        while (!q.isEmpty()) {
//            day++;
//            int size = q.size();
//            for (int i = 0; i < size; i++) {
//                int[] zom = q.poll();
//                for (int d = 0; d < 4; d++) {
//                    int[] checking = {zom[0] + magicX[d], zom[1] + magicY[d]};
//                    if (!valid(checking, grid)) {
//                        continue;
//                    }
//                    grid[checking[0]][checking[1]] == 1;
//                    remain--;
//                    if (remain == 0) return day;
//                    q.offer(checking);
//                }
//            }
//        }
//        return -1;
//    }
//
//    private boolean valid(int[] checking, int[][] grid) {
//        if (checking[0] < 0 || checking[0] >= grid.length) return false;
//        if (checking[1] < 0 || checking[1] >= grid[0].length) return false;
//        return grid[checking[0]][checking[1]] == 0;
//    }
//}