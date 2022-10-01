// Ques:https://leetcode.com/problems/remove-k-digits/description/

class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)
        return "0";
        int copy=k;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<num.length();i++){
            while(!st.isEmpty()&&st.peek()>num.charAt(i)&&k>0){
                 st.pop();
                k--;
            }
            if(!st.isEmpty()||num.charAt(i)!='0') 
            st.push(num.charAt(i));
        }
        String ans="";
    while(k>0&&!st.isEmpty()){
        k--;
        st.pop();
        if(st.size()==0)
return "0";
    }
            if(st.size()==0)
return "0";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }

return ans;
    }
}
