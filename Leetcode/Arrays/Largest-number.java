// Ques:https://leetcode.com/problems/largest-number/

class Solution {
    public String largestNumber(int[] nums) {
        String ans="";
     
        for(int i=0;i<nums.length;++i){
            for(int j=i+1;j<nums.length;++j)
            {
             String ans1=Integer.toString(nums[i])+Integer.toString(nums[j]);  
                String ans2=Integer.toString(nums[j])+Integer.toString(nums[i]);
if(Long.valueOf(ans1)<Long.valueOf(ans2)){
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}
            }    
        
    }
        int i=0;
     while(nums.length>1&&i<nums.length-1&&(nums[i]==0&&nums[i+1]==0)){
         i+=1;
     }
        while(i<nums.length){
            ans+=nums[i];
            ++i;
        }
        return ans;
}
    }
