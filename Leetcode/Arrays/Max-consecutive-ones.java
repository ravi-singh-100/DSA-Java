// Ques: https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int ans=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]==1){
             ++count;
            }
            else{
                ans=Math.max(ans,count);
                count=0;
            }
        }
         ans=Math.max(ans,count);
        return ans;
    }
}