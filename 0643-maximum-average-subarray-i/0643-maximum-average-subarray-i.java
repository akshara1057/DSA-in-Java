class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int j=0;
        int sum =0;
        double max=Integer.MIN_VALUE;
        for(j=0;j<k;j++){
            sum = sum + nums[j];
        }
        max = Math.max(sum,max);
        for(j=k;j<nums.length;j++){
            sum = sum + nums[j]-nums[j-k];
            max = Math.max(sum,max);
        }
        return max/k;
    }
}