// Ques:https://leetcode.com/problems/wiggle-subsequence/description/

class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length==1) return 1;
  int count=nums[1]-nums[0]!=0?2:1;
    int dif;
    int pre=nums[1]-nums[0];
    for(int i=2;i<nums.length;i++){
        dif=nums[i]-nums[i-1];
        if(dif>0&&pre<=0){
            count++;
            pre=dif;
        }
        else if(dif<0&&pre>=0){
            count++;
            pre=dif;
        }
    }
    
        return count;
    }
}
