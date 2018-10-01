package DP;

public class CoinChange {
    /**
     * @param coins: a list of integer
     * @param M: a total amount of money amount
     * @return: the fewest number of coins that you need to make up
     */
    public int coinChange(int[] coins, int M) {
        // write your code here
        //an array to save state status from 0 to M, so length = M+1
        int[] f = new int[M + 1];

        //initialization
        f[0] = 0;
        int i, j;
        for (i = 1; i <= M; i++) {
            f[i] = Integer.MAX_VALUE;
            for (j = 0; j < coins.length; j++) {
                //check if there could be
                if (i >= coins[j] && f[i - coins[j]] < Integer.MAX_VALUE) {
                    f[i] = Math.min(f[i], f[i - coins[j]] + 1);
                }
            }
        }
        return f[M] == Integer.MAX_VALUE ? -1 : f[M];
    }
}
