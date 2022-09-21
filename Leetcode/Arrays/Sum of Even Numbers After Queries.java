// Ques:https://leetcode.com/problems/sum-of-even-numbers-after-queries/

class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum=0;
    for(int i: nums){
        if(i%2==0)
            sum+=i;
    }
        int []ans=new int[queries.length];
        for(int i=0;i<queries.length;++i){
          
        if((queries[i][0]+nums[queries[i][1]])%2==0)
            { 
                  if(nums[queries[i][1]]%2!=0){
                sum+=(queries[i][0]+nums[queries[i][1]]);
                   
            }    
                else{
                    sum-=nums[queries[i][1]];
                   sum+=( queries[i][0]+nums[queries[i][1]]);
                }
                 ans[i]=sum;
}
       
            else {
                if(nums[queries[i][1]]%2==0){
                    sum-=nums[queries[i][1]];
                }           
                ans[i]=sum;
            }            
          nums[queries[i][1]] =(queries[i][0]+nums[queries[i][1]]);             
        }
        return ans;
    }
}
