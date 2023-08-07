// Ques:https://leetcode.com/problems/different-ways-to-add-parentheses/

class Solution {
   
    public List<Integer> diffWaysToCompute(String expression) {
       List<Integer>ans=new ArrayList<>();
    List<Integer>left=new ArrayList<>();
    List<Integer>right=new ArrayList<>();
    int n=expression.length();
    for(int i=0;i<n;i++){
        char ch=expression.charAt(i);
        if(ch=='+'||ch=='-'||ch=='*'){
            left= diffWaysToCompute(expression.substring(0,i));
            right= diffWaysToCompute(expression.substring(i+1));
            for(Integer j:left){
                for(Integer k:right){
                    int c=0;
                    switch(ch){
                        case '+':c=j+k;
                        break;
                        case '*':c=j*k;
                        break;
                        case '-':c=j-k;
                        break;
                    }
                       ans.add(c);
                }
            }
         
        }
    }  
    if(ans.size()==0){
        ans.add(Integer.parseInt(expression));

    }
    return ans;
    }
}
