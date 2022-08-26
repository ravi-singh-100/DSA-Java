// Ques: https://leetcode.com/problems/reverse-words-in-a-string/submissions/

class Solution {
    public String reverseWords(String s) {
 String ans="";
		boolean flag=false;
int endindex=s.length()-1;
while(endindex>=0&&s.charAt(endindex)==' ') {
	--endindex;
}
int startindex=0;
while(startindex<s.length()&&s.charAt(startindex)==' ') {
	++startindex;
}
int end=endindex;
for(int i=endindex;i>=startindex;) {
	while(i>=startindex&&s.charAt(i)!=' ') {
		--i;
	}
	ans+=s.substring(i+1,end+1);
	while(i>=startindex&&s.charAt(i)==' ') {
		--i;
		flag=true;
	}
	if(flag) {
		ans+=" ";
        flag=false;
	}
	
	end=i;
}
    return ans;
    }
}
