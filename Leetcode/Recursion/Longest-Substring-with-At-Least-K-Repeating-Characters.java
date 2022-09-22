// Ques:https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/

class Solution {
    public int longestSubstring(String s, int k) {
        int n=s.length();
        if(n==0||n<k)
            return 0;
        else if(k==1)
            return s.length();
        int fre[]=new int[26];
        for(int ch:s.toCharArray()){
            fre[ch-'a']++;
        }
        int l=0;
        while(l<n&&fre[s.charAt(l)-'a']>=k)
            ++l;
        if(l>=s.length())
            return s.length();
        int l1=longestSubstring(s.substring(0,l),k);
        while(l<n&&fre[s.charAt(l)-'a']<k)++l;
        int l2=0;
        if(l<s.length())
        l2=longestSubstring(s.substring(l),k);
        return Math.max(l1,l2);
    }
}
