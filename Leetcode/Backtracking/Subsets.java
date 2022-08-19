// Ques: https://leetcode.com/problems/subsets/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    List<Integer>li=new ArrayList<>();
List<List<Integer>>ans=new ArrayList<>();
func(nums,0,li,ans);
        return ans;
}
	public static void func(int []nums,int index,List<Integer>li,List<List<Integer>>ans) {
		if(index>=nums.length) {
			// System.out.println(li);
			ans.add(new ArrayList<>(li));
			return;
		}
		func(nums,index+1,li,ans);
		li.add(nums[index]);
		func(nums,index+1,li,ans);
        li.remove(li.size()-1);
		
               }
}
