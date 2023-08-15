// Ques:https://leetcode.com/problems/combination-sum-iv/

class Solution {
    public int combinationSum4(int[] nums, int target) {
        int []dp=new int[target+1];
        Arrays.fill(dp,-1);
       return helper(nums,target,0,dp);
    }
    public int helper(int[]nums,int target,int sum,int[]dp){
        if(sum==target) return 1;
        if(sum>target) return 0;
        if(dp[sum]!=-1) return dp[sum];
        int ans=0;
for(int i=0;i<nums.length;i++){
   ans+= helper(nums,target,nums[i]+sum,dp);
}
return dp[sum]=ans;
    }
}
