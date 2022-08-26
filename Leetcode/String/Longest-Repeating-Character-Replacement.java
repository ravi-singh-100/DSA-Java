// Ques:https://leetcode.com/problems/longest-repeating-character-replacement/

class Solution {
    public int characterReplacement(String s, int k) {
     
  int maxlength=0;
        int maxfrequency=0;
        int window_start=0;
     
        int []char_count=new int[26];
        for(int window_end=0;window_end<s.length();++window_end){
            char_count[s.charAt(window_end)-'A']++;
            int count=char_count[s.charAt(window_end)-'A'];
            maxfrequency=Math.max(count,maxfrequency);
            
            while(window_end-window_start-maxfrequency+1>k){
                char_count[s.charAt(window_start)-'A']--;
                window_start++;
                maxfrequency=char_count[0];
                for(int i=1;i<26;++i){
                   maxfrequency=Math.max(char_count[i],maxfrequency) ;
                }
                
            }
maxlength=Math.max(maxlength,window_end-window_start+1);
        }
        return maxlength;
    }
}
