// QUes: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

class Solution {
    public int minMoves(int[] nums) {
        int small=nums[0];
        for(int i=1;i<nums.length;++i){
            if(nums[i]<small){
                small=nums[i];
            }
        }
        int count=0;
        for(int i=0;i<nums.length;++i){
            count+=(nums[i]-small);
        }
        return count;
    }
}
