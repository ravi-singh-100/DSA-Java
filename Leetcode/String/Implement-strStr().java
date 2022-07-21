// Ques: https://leetcode.com/problems/implement-strstr/


class Solution {
    public int strStr(String haystack, String needle) {
        if(needle=="")
            return 0;
        int ans=check(haystack,needle);
        return ans;
    }
    public int check(String haystack, String needle){
        for(int i=0;i<=haystack.length()-needle.length();++i){
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
}
