class Solution {
    public int minimumPushes(String word) {
        int ans =0;
        int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            arr[word.charAt(i) - 'a']++;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        for(int i=0;i<26;i++){
            ans = ans + arr[i]*(i/8 + 1);
        }
        return ans;
    }
}