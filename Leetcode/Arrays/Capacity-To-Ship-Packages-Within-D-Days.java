// Ques:https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        for(int i:weights){
            low=Math.max(low,i);
        }
        int high=0;
        for(int i:weights){
high+=i;
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isitpossible(weights,mid,days)){
                    ans=mid;
                    high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean isitpossible(int []weights,int mid,int days){
        int d=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
sum+=weights[i];
if(sum>mid){
    d++;
    sum=weights[i];
}
        }
        return d<=days;
    }
}
