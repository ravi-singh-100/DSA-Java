// Ques: https://leetcode.com/problems/subsets-ii/

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>li=new ArrayList<>();
List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
func(nums,0,li,ans);
        return ans;
}
	public static void func(int []nums,int index,List<Integer>li,List<List<Integer>>ans) {
		if(index>=nums.length) {
			// System.out.println(li);
			ans.add(new ArrayList<>(li));
			return;
		}
         if(li.size()==0||nums[index]!=li.get(li.size()-1))
		func(nums,index+1,li,ans);
       // {
		li.add(nums[index]);
		func(nums,index+1,li,ans);
        li.remove(li.size()-1);
        // }
    }
}
