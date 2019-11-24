import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
		//return forEachTest(nums, target);
		return forHashMap(nums, target);
    }
	
	private int[] forEachTest(int[] nums, int target) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
	}
	
	private int[] forHashMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
	}
}
