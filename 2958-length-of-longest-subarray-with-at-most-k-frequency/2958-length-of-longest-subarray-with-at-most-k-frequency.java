class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {

            int num = nums[right];

            map.put(num, map.getOrDefault(num, 0) + 1);

            while (map.get(num) > k) {
                int leftNum = nums[left];

                map.put(leftNum, map.get(leftNum) - 1);

                left++;
            }

            int length = right - left + 1;
            max = Math.max(max, length);
        }

        return max;
    }
}