import java.util.Arrays;

public class RemoveDup {
    public static int deduplication(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[len]) {
                nums[++len] = nums[i];
            }
            toString(nums);
        }
        return len + 1;
    }

    public static void toString(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int a : nums) {
            sb.append(a);
            sb.append(", ");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,34,4,42,22,1,12,33,3};
        System.out.println(deduplication(a));
    }
}
