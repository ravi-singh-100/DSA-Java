// Ques:https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/

class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans=0;
        int count=0;
        int start=0;
        int end=0;
        int n=nums.length;
        while(end<n){
            if(nums[end]>=left&&nums[end]<=right){
count=end-start+1;
ans+=count;
            }
            else if(nums[end]<left){
               ans+=count;
            }
            else{
                start=end+1;
                count=0;
            }
            end++;
        }
        return ans;
    }
}
