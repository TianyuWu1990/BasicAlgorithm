package Test;

import DoublePointers.KthLargest;

public class testKthLargest {
    public static void main(String[] args) {
        int[] test = new int[]{2,1};
        KthLargest kl = new KthLargest();
        System.out.println(kl.findKthLargest(test, 2));
    }
}
