// Ques: https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
     int []output=new int[2];
       
			 int start=0;
			 
			 int end=nums.length-1;
			 while(start<=end) {
				 if(nums[start]+nums[end]<target) {
					 ++start;
				 }
				 else if(nums[start]+nums[end]>target) {
			 --end;
				 }
				 else {
                     output[0]=nums[start];
                     output[1]=nums[end];
					 
                      ++start;
						 --end;
				 }
					
			 }
        return output;
    }
}
