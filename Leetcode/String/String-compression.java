// Ques: https://leetcode.com/problems/string-compression/


class Solution {
    public int compress(char[] chars) {
        int length=0;
        int index=0;
    String s="";
        for(int i=0;i<chars.length;++i){
            s+=chars[i];
            chars[index]=s.charAt(index);
            ++index;
            length+=1;
            while(i<chars.length-1&&chars[i+1]==chars[i]){
                length+=1;
                i+=1;
            }
            if(length!=1){
                 s+=length;
                while(index<s.length()){
                     chars[index]=s.charAt(index);
                index++;
                }
                
               
            }
           
            length=0;
        }
        // System.out.println(s);
     return index;
    }
}
