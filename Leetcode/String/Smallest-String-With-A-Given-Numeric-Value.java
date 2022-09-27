// Ques:https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/

class Solution {
    public String getSmallestString(int n, int k) {
         StringBuilder ans = new StringBuilder("");
        while(n>0){
            int x=k-(n-1);
           
              if(x<26){
               char ch=(char)(x+96);
                ans.append(ch);
                  k=k-x;
            }
                
          else {
                ans.append('z');
                k=k-26;
            }
         
       n--;
        }
        return ans.reverse().toString();
    }
}
