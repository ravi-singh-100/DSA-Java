// Ques: https://leetcode.com/problems/combinations/

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>li=new ArrayList<>();
        func(ans,li,n,k,1);
        return ans;
    }
    public static void func(List<List<Integer>> ans,List<Integer>li,int n,int k,int index){
        if(li.size()==k){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=index;i<=n;++i){
            li.add(i);
            func(ans,li,n,k,i+1);
            li.remove(li.size()-1);
        }
    }
}
