// QUes:https://leetcode.com/problems/minimum-size-subarray-sum/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int count=Integer.MAX_VALUE;
        while(left<nums.length){
            while(right<nums.length&&sum<target){
                sum+=nums[right];
                ++right;
            }
            if(left<nums.length&&sum>=target){
                // System.out.println(sum);
                sum-=nums[left];
                count=Math.min(count,right-left);
                  // System.out.println("count"+count);
                ++left;
            }
            else{
                ++left;
                ++right;
            }
        }
        if(count!=Integer.MAX_VALUE)return count;
        else return 0;
    }
}
