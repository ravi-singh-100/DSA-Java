// Ques: https://leetcode.com/problems/permutations-ii/

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
      	List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer>li=new ArrayList<>();
        print(ans,li,nums,0);
       return ans;
    }
    public void print(List<List<Integer>>ans,List<Integer>li,int[]nums,int index) {
if(li.size()==nums.length) {
	ans.add(new ArrayList<>(li));
	return;
}
for(int i=index;i<nums.length;++i) {
    if(i!=index&&func(index,i,nums)) continue;
            li.add(nums[i]);  
swap(i,index,nums);
    print(ans,li,nums,index+1);       
    li.remove(li.size()-1);
        swap(i,index,nums);
    
    }
       }
       public boolean func(int index,int i,int[]nums ){
           for(int j=index;j<i;j++){
               if(nums[j]==nums[i])
                   return true;
           }
           return false;
       }
   public void swap(int i,int index,int []nums){
       int temp=nums[i];
       nums[i]=nums[index];
       nums[index]=temp;
   }
}
