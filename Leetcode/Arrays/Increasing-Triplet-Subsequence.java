// Ques:https://leetcode.com/problems/increasing-triplet-subsequence/description/

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
    if(nums.length<3) return false;
    for(int i:nums){
        if(first>=i)
        first=i;
        else if(second>=i)
        second=i;
        else return true;
    }
    return false;
        }
}
