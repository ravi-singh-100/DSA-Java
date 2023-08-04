// Ques:https://leetcode.com/problems/decoded-string-at-index/

class Solution {
    public String decodeAtIndex(String s, int k) {
       long size=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                size=size*(ch-'0');
            }
            else{
                size++;
            }
        }
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            k%=size;
            if((k==0||k==size)&&!Character.isDigit(ch)){
                return ch+"";
            }
            else if(Character.isDigit(ch)){
                size/=(ch-'0');
                k%=size;
            }
            else {
                size--;
            }
        }
return null;
    }
}
