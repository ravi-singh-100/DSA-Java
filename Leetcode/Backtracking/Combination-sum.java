// Ques: https://leetcode.com/problems/combination-sum/

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>li=new ArrayList<>();
        func(candidates,target,0,li,ans,0);
        return ans;
    }
    public static void func(int[]candidates,int target,int sum,List<Integer>li,List<List<Integer>>ans,int index){
        if(sum==target){
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=index;i<candidates.length;++i){
            if(sum<=target){
                li.add(candidates[i]);
                func(candidates,target,sum+candidates[i],li,ans,i);
                    li.remove(li.size()-1);
}
        }
    }
}
