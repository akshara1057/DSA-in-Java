class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;        
        HashSet<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        while (j < arr.length) {
            if (!set.contains(arr[j])) {
                set.add(arr[j]);
                max = Math.max(max, j - i + 1);
                j++;
            } 
            else {
                set.remove(arr[i]);
                i++;
            }
        }
        
        return max;
    }
}
