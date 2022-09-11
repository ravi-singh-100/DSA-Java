// Ques:https://leetcode.com/problems/removing-stars-from-a-string/

class Solution {
    public String removeStars(String s) {
StringBuilder sb = new StringBuilder();
        int count = 0; 
        int i = s.length() - 1;
        
        while (i >= 0){
            if (s.charAt(i) == '*'){
                count++;
                             
            } else if(count != 0){
                
                count--;
            } else {
                sb.append(s.charAt(i));
                
            }
            i--;
        }
        return sb.reverse().toString();
    }
}
