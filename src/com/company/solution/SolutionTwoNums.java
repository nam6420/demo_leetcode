package com.company.solution;

import java.util.HashMap;
import java.util.Map;

public class SolutionTwoNums {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer valueMap = numMap.get(target - nums[i]);
            if (valueMap != null) {
                return new int[]{valueMap, i};
            }

            numMap.put(nums[i], i);
        }
        return null;
    }

}
