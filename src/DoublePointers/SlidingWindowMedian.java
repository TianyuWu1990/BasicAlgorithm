package DoublePointers;

import java.util.*;

public class SlidingWindowMedian {
    public List<Integer> medianSlidingWindow(int[] nums, int k) {
            if (k == 0) return new ArrayList<>();
            List<Integer> ans = new ArrayList<Integer>();
            int[] window = new int[k];
            for (int i = 0; i < k; ++i)
                window[i] = nums[i];
            Arrays.sort(window);
            for (int i = k; i <= nums.length; ++i) {
                ans.add(k%2 == 0? window[(k - 1)/2] : window[k/2]);
                if (i == nums.length) break;
                remove(window, nums[i - k]);
                insert(window, nums[i]);
            }
            return ans;
        }

        // Insert val into window, window[k - 1] is empty before inseration
        private void insert(int[] window, int val) {
            int i = 0;
            while (i < window.length - 1 && val > window[i]) ++i;
            int j = window.length - 1;
            while (j > i) window[j] = window[--j];
            window[j] = val;
        }

        // Remove val from window and shrink it.
        private void remove(int[] window, int val) {
            int i = 0;
            while (i < window.length && val != window[i]) ++i;
            while (i < window.length - 1) window[i] = window[++i];
        }


}
