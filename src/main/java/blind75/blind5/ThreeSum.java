package blind75.blind5;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (i > 0 && curr == nums[i - 1])
                continue;
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int threeSum = curr + nums[l] + nums[r];
                if (threeSum > 0)
                    r--;
                else if (threeSum < 0)
                    l++;
                else {
                    result.add(Arrays.asList(curr, nums[l], nums[r]));
                    l++;
                    while (nums[l] == nums[l - 1] && l < r)
                        l++;
                }
            }
        }
        return result;
    }
}
