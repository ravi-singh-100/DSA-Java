// Ques:https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {
      // using two pointer
        String ans="";
        for(int i=0;i<s.length();++i){
           int start=i;
            while(i<s.length()&&s.charAt(i)!=' '){
                ++i;
            }
            ans+=reverse(s,start,i-1);
            if(i<s.length())
                ans+=" ";
        }
        return ans;
    }
    public String reverse(String s,int start,int end){
        String ans="";
        while(end>=start){
            ans+=s.charAt(end);
            --end;
        }
        return ans;
    }
}
