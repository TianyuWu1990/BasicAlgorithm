package DoublePointers;

public class KthLargest {
    public int findKthLargest(int[] nums, int k) {

        return myQuickSelect(nums, 0, nums.length - 1, k);
    }

    private int myQuickSelect(int[] nums, int low, int high, int k) {
        int i = low;
        int j = high;
        int pivot = nums[low];
        while (i <= j) {
            while(nums[i] > pivot && i <= j) {
                i++;
            }
            while (nums[j] < pivot && i <= j) {
                j--;
            }
            if (i <= j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }


        if (k + low - 1 <= j) {
            return myQuickSelect(nums, low, j, k);
        }
        if (k - 1 + low >= i) {
            return myQuickSelect(nums, i, high, k - (i - low));
        }
        return nums[j+1];

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
