class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int len = 0;
        while (len < nums.length) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i <= len; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
            for (int i = len; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }
            if ((max - min) <= k) {
                return len;
            }
            len++;
        }
        return -1;
    }
}