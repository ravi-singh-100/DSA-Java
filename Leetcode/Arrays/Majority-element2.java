// Ques: https://leetcode.com/problems/majority-element-ii/

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int number1=0;
        int number2=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]==number1){
                ++count1;
            }
                else if(nums[i]==number2){
                    ++count2;
                }
                else if(count1==0){
                    ++count1;
                    number1=nums[i];
                }
                else if(count2==0){
                    ++count2;
                    number2=nums[i];
                }
                else {
                    --count1;
                    --count2;
                }
            
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]==number1)
                ++count1;
            else if(nums[i]==number2)
                ++count2;
            
        }
        ArrayList<Integer>list=new ArrayList<>();
        if(count1>(nums.length)/3)
            list.add(number1);
        if(count2>(nums.length)/3)
            list.add(number2);
        return list;
    }
}
