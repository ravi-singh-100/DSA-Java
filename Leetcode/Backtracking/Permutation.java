// Ques: https://leetcode.com/problems/permutations/submissions/

class Solution {
    public List<List<Integer>> permute(int[] nums) {
      	List<List<Integer>>ans=new ArrayList<>();
        List<Integer>li=new ArrayList<>();
        // int[]nums= {1,2,3};
        boolean[]visited=new boolean[nums.length];
        print(ans,li,nums,visited);
        // System.out.println(ans);
       return ans;
    }
    public static void print(List<List<Integer>>ans,List<Integer>li,int[]nums,boolean[]visited) {
if(li.size()==nums.length) {
	ans.add(new ArrayList<>(li));
	return;
}
for(int i=0;i<nums.length;++i) {
	
	if(!visited[i]) {
		visited[i]=true;
		li.add(nums[i]);
		print(ans,li,nums,visited);
		li.remove(li.size()-1);
		visited[i]=false;
	}
	
	
}
    }
   
}
