// Ques: https://leetcode.com/problems/permutation-sequence/

class Solution {
    public String getPermutation(int n, int k) {
        if(n==1)
            return "1";
  ArrayList<String>li=new ArrayList<>();
        boolean []arr=new boolean[10];
               int fact; 
            fact=n-1;
              int prod=n-1;
        while(prod>1){
            fact*=(prod-1);
            --prod;
        }
         int x=k/fact;
        if(k%fact!=0){
            x+=1;
            arr[x]=true;
        }
        else{
            arr[x]=true;
        }
     
     func(n,""+x,li,arr);
        if(k%fact==0)
            return li.get(li.size()-1);
        return li.get((k%fact)-1);
    }
    public void func(int n,String ans,ArrayList<String>li,boolean []arr){
    
        if(ans.length()==n){
         
         li.add(ans);
           return ; 
        }

        for(int i=1;i<=n;++i){
         
            if(!arr[i]){
                 arr[i]=true;
             func(n,ans+i,li,arr);
            arr[i]=false;   
            }

        }
    }
}
