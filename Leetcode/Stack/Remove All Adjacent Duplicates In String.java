// Queshttps://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty()&&st.peek()==ch){
                st.pop();
            }
            else {
                st.push(ch);
            }
        }
   StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}
