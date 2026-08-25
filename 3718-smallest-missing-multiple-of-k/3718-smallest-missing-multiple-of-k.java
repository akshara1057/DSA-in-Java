class Solution {
    public int missingMultiple(int[] nums, int k) {
        int x = 1;
        int j;
        for(int i =0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(nums[j]==k*x){
                    break;
                }
            }
            if(j==nums.length){
                return k*x;
            }
            x++;
        }
        return k*x;
    }
}