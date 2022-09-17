// Ques:https://leetcode.com/problems/k-th-symbol-in-grammar/

class Solution {
    public int kthGrammar(int n, int k) {
      return func(n,k);
    }
    public int func(int n,int k){
        if(n==1){
            return 0;
        }
        // System.out.println(n+" "+(k/2)+(k%2));
int parent=func(n-1,(k/2)+(k%2));
        if(parent%2==0){
             if(k%2==0)
            return 1;
            else 
                return 0;
        }
        else{
            if(k%2==1)
                return 1;
            else 
                return 0;
        }
        
    }
}
