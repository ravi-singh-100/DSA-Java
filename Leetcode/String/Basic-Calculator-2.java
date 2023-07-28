// Ques:https://leetcode.com/problems/basic-calculator-ii/description/

class Solution {
    public int calculate(String s) {
        Stack<Integer>st=new Stack<>();
         char sign='+';
        for(int i=0;i<s.length();i++){
            int val=0;
            if(Character.isDigit(s.charAt(i))){
                while(i<s.length()&&Character.isDigit(s.charAt(i))){
val=val*10+(s.charAt(i)-'0');
i++;
                }
            i--;
                if(sign=='+')
                st.push(val);
                else if(sign=='-'){
                    st.push(-val);
                }
                else if(sign=='*'){
                    st.push(st.pop()*val);
                }
                else if(sign=='/'){
                    st.push(st.pop()/val);
                }
            }
            else if(s.charAt(i)!=' '){
                sign=s.charAt(i);
            }
        }int sum=0;
        while(!st.isEmpty()){
sum+=st.pop();
        }
        return sum;
    }
}
