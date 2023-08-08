// Ques:https://leetcode.com/problems/perfect-squares/

class Solution {
    public int numSquares(int n) {
        int[]dp=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=i;
            for(int j=1;j*j<=i;j++){
                
                dp[i]=Math.min(1+dp[i-j*j],dp[i]);
            }
        }
        return dp[n];
    }
}
