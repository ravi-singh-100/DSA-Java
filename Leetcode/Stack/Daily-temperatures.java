// Ques: https://leetcode.com/problems/daily-temperatures/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st=new Stack<>();
        int[]a=new int[temperatures.length];
        for(int i=0;i<temperatures.length;++i){
            while(!st.isEmpty()&&temperatures[st.peek()]<temperatures[i]){
                a[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        return a;
    }
}
