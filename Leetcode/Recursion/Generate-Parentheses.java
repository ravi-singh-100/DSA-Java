// Ques: https://leetcode.com/problems/generate-parentheses/

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
print(0,0,n,"",list);
// System.out.println(list);
        return list;
	}
public static void print(int open,int close,int n,String str,List<String>list) {
	if(open==n&&close==n) {
//		System.out.println(str);
		list.add(str);
		return;
	}
	if(open<n)
		print(open+1,close,n,str+"(",list);
	if(close<open) {
		print(open,close+1,n,str+")",list);
	}
    }
}
