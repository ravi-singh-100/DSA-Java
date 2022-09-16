// Ques:https://leetcode.com/problems/find-all-anagrams-in-a-string/

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
List<Integer>li=new ArrayList<>();
        if(p.length()>s.length())
            return li;
       int []org=new int[26];
        int left=0;
        int right=p.length()-1;
        while(left<s.length()-p.length()+1){
            int ptr=0;
            int flag=0;
             while(ptr+left<=right){
            		 ++org[p.charAt(ptr)-'a'];
            		 --org[s.charAt(ptr+left)-'a'];
            		   ++ptr; 

        }
//             int j;
             for( int j=0;j<org.length;++j) {
            	 if(org[j]!=0) {
            		flag=1; 
            	 }
            	 org[j]=0;
            		 
             }
             if(flag!=1) {
            	 li.add(left);
             }
            
            ++left;
            ++right;
        }
      return li;
    }
}
