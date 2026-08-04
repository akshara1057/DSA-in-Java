class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer>list =new ArrayList<>();
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            min++;
            if(nums[i]!=min){
                list.add(min);
                i=i-1;
            }
        }
        return list;
    }
}