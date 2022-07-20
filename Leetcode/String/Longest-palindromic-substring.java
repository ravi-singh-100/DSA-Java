// Ques: https://leetcode.com/problems/longest-palindromic-substring/

class Solution {
    public String longestPalindrome(String s) {
        int max = Integer.MIN_VALUE;
        String ans = "";
        for (int i = 0; i < s.length(); ++i) {
            String ans1 = checkPalindrome(s, i, i);
            String ans2 = checkPalindrome(s, i, i + 1);
            if (max < Math.max(ans1.length(), ans2.length())) {
                max = Math.max(ans1.length(), ans2.length());
                if (ans1.length() > ans2.length()) {
                    ans = ans1;
                } else {
                    ans = ans2;
                }
            }
        }
       return ans;
        // System.out.println(ans);
    }

    public static String checkPalindrome(String s, int left, int right) {
//        String ans = "";
        int flag=0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            flag=1;
//            if (left != right)
//                ans += s.charAt(left);
            // if(left!=right)
//            ans += s.charAt(right);
            --left;
            ++right;
        }
        if(flag==0){
            return s.substring(left,right);
        }
        else{
        // if(left<1)
        return s.substring(left+1,right);
        }
        // else if(right==s.length())
        //     return s.substring(left+1,right);
        // else return s.substring(left,right);
    }

    
}
