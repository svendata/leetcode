class Solution {
    public int removeDuplicates(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        int len = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[len] != nums[i]) {
                nums[++len] = nums[i];
            }
        }
        return len + 1;
    }
}
