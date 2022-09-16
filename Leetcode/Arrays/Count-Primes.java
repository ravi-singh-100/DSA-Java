Ques:https://leetcode.com/problems/count-primes/

class Solution {
    public int countPrimes(int n) {
        if(n==0||n==1)
            return 0;
        int i=2;
        boolean []arr=new boolean[n];
        arr[0]=true;
        arr[1]=true;
        while(i*i<n){
            if(!arr[i]){
               for(int j=2;j*i<n;++j){
                 arr[j*i]=true;   
               } 
            }
            ++i;
        }
        int count=0;
        for(int j=2;j<n;++j){
            if(!arr[j])
                ++count;
        }
        return count;
    }
}
