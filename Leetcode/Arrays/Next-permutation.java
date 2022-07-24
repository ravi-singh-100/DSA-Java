// Ques:  https://leetcode.com/problems/next-permutation/

class Solution {
    public void nextPermutation(int[] nums) {
        int index1=0,index2=nums.length-1;
        for(int i=nums.length-2;i>=0;--i){
             if(nums[i+1]>nums[i])
             {
                  index1=i;
                 break;
             }
                
        }
        for(int i=nums.length-1;i>=0;--i){
             if(nums[i]>nums[index1]){
                 index2=i;
                 break;
             }
                 
        }
          if(nums[index1]>nums[index2])
            reverse(nums,index1,nums.length-1);
        else{
            swap(nums,index1,index2);
            reverse(nums,index1+1,nums.length-1);
        }      
    }
    public void swap(int []nums,int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
    public void reverse(int []nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            ++start;
            --end;
        }
}
}
