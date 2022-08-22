// Ques:  https://leetcode.com/problems/count-good-numbers/

class Solution {
    public int countGoodNumbers(long n) {
        long even=n/2+n%2;
        long odd=n/2;
    return (int)((func(4,odd)*func(5,even))%1000000007;
// func(n,odd,even);
    }
    public long func(long n ,long power){
        if(power==0)
            return 1;
        long ans=func(n,power/2);
        ans*=ans;
        ans%=1000000007;
        if(power%2==1){
             ans*=n;
}
       ans%=1000000007;     
        return ans;
    }
    
}
