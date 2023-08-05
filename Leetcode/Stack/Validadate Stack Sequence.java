// Ques:https://leetcode.com/problems/validate-stack-sequences/

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer>st=new Stack<>();
        int index=0;
        for(int i=0;i<pushed.length;i++){
            st.push(pushed[i]);
            while(!st.isEmpty()&&st.peek()==popped[index]){
                st.pop();
                index++;
            }
        }
        return st.size()==0;
    }
}
