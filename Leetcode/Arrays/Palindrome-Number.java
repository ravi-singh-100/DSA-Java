// Ques:  https://leetcode.com/problems/palindrome-number/

class Solution {
    public boolean isPalindrome(int x) {
       if(x<0)
           return false;
        int copy=x;
        int sum=0;
        while(copy>0){
            sum=sum*10+(copy%10);
            copy/=10;
        }
        return sum==x;
    }
}
