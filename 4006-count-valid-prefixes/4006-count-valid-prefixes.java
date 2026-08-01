class Solution {
    public int countValidPrefixes(String s) {
        int j = 0;
        int count = 0;
        int[] freq = new int[2];
        while (j < s.length()) {
            freq[s.charAt(j) - '0']++;
            if (Math.abs(freq[0] - freq[1]) < 2) {
                count++;
            }
            j++;
        }
        return count;
    }
}