// Ques:https://leetcode.com/problems/132-pattern/description/

class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int k=Integer.MIN_VALUE;
      for(int i=nums.length-1;i>=0;i--)  {
        if(k>nums[i]) return true;
         while(!st.isEmpty()&&st.peek()<nums[i]){
k=Math.max(k,st.peek());
st.pop();
         }
 st.push(nums[i]);
    }
    return false;
}
}
