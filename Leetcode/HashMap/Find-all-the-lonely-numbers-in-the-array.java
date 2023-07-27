// Ques:https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/description/
class Solution {
    public List<Integer> findLonely(int[] nums) {
      List<Integer>li=new ArrayList<>();
      HashMap<Integer,Integer>map=new HashMap<>();
      int n=nums.length;
      for(int i:nums){
          if(map.containsKey(i)){
              map.put(i,map.get(i)+1);
          }
          else {
              map.put(i,1);
          }
      } 
      for(int key:map.keySet()){
if(map.get(key)==1&&!(map.containsKey(key-1)||map.containsKey(key+1))){
    li.add(key);
}
      } 
      return li;
    }
}
