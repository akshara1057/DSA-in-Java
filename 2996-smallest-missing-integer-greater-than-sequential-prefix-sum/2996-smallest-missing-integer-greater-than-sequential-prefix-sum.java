class Solution {
    public int missingInteger(int[] nums) {
        int index = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                index = i;
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += nums[i];
        }
        while (true) {
            boolean found = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == sum) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return sum;
            }
            sum++;
        }
    }
}