// Ques:https://leetcode.com/problems/basic-calculator/description/

class Solution {
    public int calculate(String s) {
        int sum=0;
        int sign=1;
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int val=0;
                while(i<s.length()&&Character.isDigit(s.charAt(i))){
                   
val=val*10+(s.charAt(i)-'0');
i++;
                }
                 sum+=(sign*val);
                 sign=+1;
                 i--;
            }
else if(s.charAt(i)=='('){
st.push(sum);
st.push(sign);
sign=+1;
sum=0;
}
else if(s.charAt(i)==')'){
    sum*=st.pop();
    sum+=st.pop();
}
else if(s.charAt(i)=='-'){
    sign*=-1;
}
        }
        return sum;
    }
}
