public class minClimbStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int f1 = 0, f2 = 0;
        for (int i = cost.length - 1; i >= 0; --i) {
            int f0 = cost[i] + Math.min(f1, f2);
            f2 = f1;
            f1 = f0;
        }
        return Math.min(f1, f2);


    }

    public static int minCostClimbingStairs1(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        for (int i = 2; i < n + 1; ++i) {
            dp[i] = Math.min(dp[i- 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        }
        return dp[dp.length-1];

    }

    public static int minCostClimbingStairs2(int[] cost) {
         int a = 0, b = 0;
         for (int num : cost) {
             int t = Math.min(a, b) + num;
             a = b;
             b = t;
         }
         return Math.min(a, b);
    }



        public static void main(String[] args) {
        int[] cost = new int[5];
        System.out.println(minCostClimbingStairs(cost));
    }
}
