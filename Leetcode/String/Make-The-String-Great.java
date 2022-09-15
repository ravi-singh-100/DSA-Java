// Ques:https://leetcode.com/problems/make-the-string-great/

class Solution {
    public String makeGood(String s) {
        String ans="";
    Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();++i){
            if(!st.isEmpty()&&(st.peek()==s.charAt(i)+32||st.peek()==s.charAt(i)-32)){
                st.pop();
                // i+=1;
            }
            else 
            st.push(s.charAt(i));
        }
        while(!st.isEmpty()){
            ans=st.peek()+ans;
            st.pop();
        }
            
        return ans;
    }
}
