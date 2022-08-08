// Ques: https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class Solution {
    static String[]arr= {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
    List<String>list=new ArrayList<>();
        if(digits.length()==0)
            return list;
print(digits,"",list);
        return list;
	}
public static void print(String digits,String ans,List<String>list) {
	if(digits.length()==0) {
        list.add(ans);
		return;
	}
	char ch=digits.charAt(0);
	int index=ch-'0';
	String key=arr[index-2];
		for(int i=0;i<key.length();i++) {
		
			print(digits.substring(1),ans+key.charAt(i),list);
		}

    }
}
