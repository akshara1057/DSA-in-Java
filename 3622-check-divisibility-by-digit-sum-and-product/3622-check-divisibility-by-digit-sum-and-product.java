class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int x=0;
        int p=1;
        while(n>0){
            int digit = n%10;
            x = x + digit;
            p = p*digit;
            n = n/10;
        }
        sum = x + p;
        if(num%sum == 0){
            return true;
        }
        return false;
    }
}