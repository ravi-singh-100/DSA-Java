// Ques:https://leetcode.com/problems/ransom-note/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
            return false;
        int []charfrequency=new int[26];
        int start1=0;
        int start2=0;
        while(start2<magazine.length()){
            if(start1<ransomNote.length()){
                 charfrequency[ransomNote.charAt(start1)-'a']--;
                  ++start1;
            }
            charfrequency[magazine.charAt(start2)-'a']++;
           
          
            ++start2;
        }
      
        for(int var:charfrequency){
            if(var<0)
                return false;
        }
        return true;
    }
}
