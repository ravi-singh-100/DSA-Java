// Ques: https://leetcode.com/problems/divide-array-into-equal-pairs/

class Solution {
    public boolean divideArray(int[] nums) {
        int []fre=new int[501];
        if(nums.length%2==1)
            return false;
        int ans=1;
        for(int i=0;i<nums.length;++i)
        {
           fre[nums[i]]++;
        }
        for(int i:nums){
            if(fre[i]%2==1)
                return false;
        }
        return true;
            
      
    }
}
