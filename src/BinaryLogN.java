public class BinaryLogN {

    public int binarySearchRecursion(int[] num, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (num[mid] == target) {
            return mid;
        }
        if (num[mid] < target) {
            return binarySearchRecursion(num, mid + 1, end, target);
        }
        return binarySearchRecursion(num, start, mid - 11, target);
    }

    /**
     * @param A an integer array sorted in ascending order
     * @param target an integer
     * @return an integer
     */
    public int findPosition(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int start = 0, end = nums.length - 1;
        // 要点1: start + 1 < end
        while (start + 1 < end) {
            // 要点2：start + (end - start) / 2
            int mid = start + (end - start) / 2;
            // 要点3：=, <, > 分开讨论，mid 不+1也不-1
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        // 要点4: 循环结束后，单独处理start和end
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;
    }

    int fastPowerRecursion(int x, int n) {
        if (n == 0) return 1;
        if (n % 2 == 0) {
            int tmp = fastPowerRecursion(x, n / 2);
            return tmp * tmp;
        } else {
            int tmp = fastPowerRecursion(x, n / 2);
            return tmp * tmp * x;
        }
    }

    int fastPowerIteration(int x, int n) {
        int ans = 1, base = x;
        while (n != 0) {
            if (n % 2 == 1) {
                ans *= base;
            }
            base *= base;
            n = n / 2;
        }
        return ans;
    }

}
