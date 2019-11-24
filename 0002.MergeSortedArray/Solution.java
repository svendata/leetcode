class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        boolean hasntFind;
        for (int i = 0; i < n; i++) {
            hasntFind = true;
            while (j < m + i)
            {
                if (nums1[j] > nums2[i]) {
                    insertArray(nums1, nums2[i], j++);
                    hasntFind = false;
                    break;
                }
                j++;
            }
            if (hasntFind) {
                insertArray(nums1, nums2[i], j);
                j++;
            }
        }

    }

    private void insertArray(int[] nums1, int val, int j) {
        int temp = nums1[j];
        nums1[j] = val;
        if (j >= nums1.length - 1) {
            return;
        }
        for (int i = nums1.length - 2; i > j; i--) {
            nums1[i + 1] = nums1[i];
        }
        nums1[j + 1] = temp;
    }
}
