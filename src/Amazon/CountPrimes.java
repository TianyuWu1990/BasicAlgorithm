package Amazon;

public class CountPrimes {

    /**
     * Sieve of Erasthenes O(nlognlogn)
     */
    public int countPrimes(int n) {

        boolean[] isPrime = new boolean[n];

        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                continue;
            }
            //multiple of i is not prime
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }

        int count = 0;

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
