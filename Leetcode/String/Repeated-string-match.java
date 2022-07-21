// Ques: https://leetcode.com/problems/repeated-string-match/

class Solution {
    public int repeatedStringMatch(String a, String b) {
        String copya=a;
        int ans=1;
   while(a.length()<b.length()){
       a+=copya;
       ++ans;
   }
        if(check(a,b))
            return ans;
        if(check(a+copya,b))
           return ans+1;
           return -1;
        
    }
           public boolean check(String a,String b){
               for(int i=0;i<=a.length()-b.length();++i){
                   if(a.substring(i,i+b.length()).equals(b))
                       return true;
               }
               return false;
           }
}
