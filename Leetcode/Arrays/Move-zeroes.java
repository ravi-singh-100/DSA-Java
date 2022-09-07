// Ques:  https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
    
        int zeroptr=0;
         while(zeroptr<nums.length&&nums[zeroptr]!=0){
                ++zeroptr;
            }
        int numptr=zeroptr+1;
        while(numptr<nums.length){
            while(zeroptr<nums.length&&nums[zeroptr]!=0){
                ++zeroptr;
            }
           
            // numptr=zeroptr+1;
            while(numptr<nums.length&&nums[numptr]==0){
                ++numptr;
            }
            if(zeroptr<nums.length&&numptr<nums.length){
                 int temp=nums[zeroptr];
            nums[zeroptr]=nums[numptr];
            nums[numptr]=temp;
            }
           ++zeroptr;
            ++numptr;
        }
    }
}
