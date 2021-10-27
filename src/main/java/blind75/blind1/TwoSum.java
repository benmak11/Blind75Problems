package blind75.blind1;

import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainValue = target - nums[i];
            if (valueIndexMap.containsKey(remainValue)){
                return new int[] {i, valueIndexMap.get(remainValue)};
            }
            valueIndexMap.put(nums[i], i);
        }
        return new int[]{ -1, -1 };
    }
}
