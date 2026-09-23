import java.util.*;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int findMe = target - nums[i];

            if (map.containsKey(findMe)) {
                return new int[]{i, map.get(findMe)};
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution");
    }
}
