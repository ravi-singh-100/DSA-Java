// Ques:https://leetcode.com/problems/score-of-parentheses/

class Solution {
    public int scoreOfParentheses(String s) {
       Stack<Integer>st=new Stack<>();
       int n=s.length();
       for(int i=0;i<n;i++){
if(s.charAt(i)=='('){
st.push(-1);
}
else{
    if(st.peek()==-1){
        st.pop();
        st.push(1);
    }
    else{
        int val=0;
        while(st.peek()!=-1){
val+=st.pop();
        }
        st.pop();
        st.push(2*val);
    }

}
       }
       int val=0;
       while(!st.isEmpty()){
val+=st.pop();
       }
       return val;
    }
}
