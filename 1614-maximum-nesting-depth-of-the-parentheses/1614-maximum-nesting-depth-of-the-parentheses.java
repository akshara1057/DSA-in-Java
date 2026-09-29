class Solution {
    public int maxDepth(String s) {
        int i=0;
        int max=0;
        int count=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                count++;
            }
            else if(s.charAt(i)==')'){
                count--;
            }
            max = Math.max(max,count);
            i++;
        }
        return max;
    }
}