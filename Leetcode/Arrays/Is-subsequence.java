// Ques:https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        int i=0;
        int count=0;
        while(i<t.length()){
            if(count<s.length()&&s.charAt(count)==t.charAt(i)){
                ++count;
            }
            ++i;
        }
        if(count==s.length())
            return true;
    return false;
    }
}
