class Solution {
    public boolean isPalindrome(String s) {
       s=s.toLowerCase();
       ArrayList<Character> list = new ArrayList<>();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if((ch>='a' && ch<='z') || (ch >= '0' && ch <= '9')){
            list.add(ch);
        }
       }
       if(list.size()==1 || list.size()==0){
        return true;
       } 
       int i = 0;
       int j = list.size()-1;
       while(i<=j){
        if(list.get(i)!=list.get(j)){
            return false;
        }
        i++;
        j--;
       }
       return true;
    }
}