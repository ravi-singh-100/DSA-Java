// Ques:https://leetcode.com/problems/decode-string/

class Solution {
    public String decodeString(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<StringBuilder>strst=new Stack<>();
        Stack<Integer>numst=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
      
            if(Character.isDigit(s.charAt(i))){
                int num=0;
                while(Character.isDigit(s.charAt(i))){
num=(num*10)+s.charAt(i)-'0';
i++;
                }
                numst.push(num);
                num=0;
                i--;
            }
            else if(s.charAt(i)=='['){
                strst.push(sb);
                sb=new StringBuilder();
           
            }
            else if(s.charAt(i)==']'){
StringBuilder temp=sb;
sb=strst.pop();
                int count=numst.pop();
                while(count-->0){
sb.append(temp);
                }
              
            }
            else{
                sb.append(s.charAt(i));
                
            }
       
        }
 return sb.toString();
    }
}
