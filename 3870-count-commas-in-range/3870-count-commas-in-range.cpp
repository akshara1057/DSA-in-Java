class Solution {
public:
    int countCommas(int n) {
        int temp=n;
         int digit=0;
        while(n>0){
            digit++;
            n=n/10;
        }
        if(digit<=3){
            return 0;
        }
        int ans = temp-1000;
        return ans+1;
    }
};