// Ques:https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

class Solution {
    public boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target) return true;
            if(nums[start]==nums[mid]&&nums[end]==nums[mid]){
               start++;
                end--;
            }
            else if(nums[mid]>=nums[start]){
                if(nums[start]<=target&&nums[mid]>target){
                    end=mid-1;
                }
                else
                    start=mid+1;
            }
            else {
                if(nums[mid]<target&&nums[end]>=target)  start=mid+1;
                    else  
                        end=mid-1;
            }
        }
        return false;
    }
}
