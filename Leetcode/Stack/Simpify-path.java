// Ques:https://leetcode.com/problems/simplify-path/
class Solution {
    public String simplifyPath(String path) {
       Stack<String>st=new Stack<>();
       for(int i=0;i<path.length();i++){
           if(path.charAt(i)=='/')continue;
           String temp="";
           while(i<path.length()&&path.charAt(i)!='/'){
temp+=path.charAt(i);
i++;
           }
           if(temp.equals("..")){
               if(!st.isEmpty()){
                   st.pop();
               }
           }
           else if(temp.equals(".") ) continue;
           else{
               st.push(temp);
           }
       } 
       if(st.isEmpty())return "/";
       String ans="";
       while(!st.isEmpty()){
           ans="/"+st.peek()+ans;
           st.pop();
       }
       
       return ans;
    }
}
