import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sum3 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            while(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length - 1;
            while(left<right){
                int sum = nums[left] + nums[right];
                if(sum + nums[i] == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                }else if(sum+nums[i] > 0){
                    right--;
                }else{
                    left++;
                }

            }
        }

        return res;
    }

    public static void main(String[] args){
        int[] nums = {1,-3,-1,3,0,4,1,2,6,4,-4};
        System.out.println(threeSum(nums));
    }
}