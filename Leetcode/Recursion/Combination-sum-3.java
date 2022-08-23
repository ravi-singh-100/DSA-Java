// Ques:https://leetcode.com/problems/combination-sum-iii/


class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>>ans=new ArrayList<>();
        List<Integer>li=new ArrayList<>();
        func(ans,li,k,n,0,1);
        return ans;
    }
    public static void func(List<List<Integer>>ans,List<Integer>li,int k,int n,int sum,int index){
        if(sum==n&&li.size()==k){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=index;i<=9;++i){
            li.add(i);
            func(ans,li,k,n,sum+i,i+1);
            li.remove(li.size()-1);
        }
    }
}
