// Ques:https://leetcode.com/problems/most-frequent-subtree-sum/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer>map=new HashMap<>();
       int[]arr=new int[2];
       
       helper(root,map,arr); 
int []ans=new int[arr[1]];
int index=0;
for(int key:map.keySet()){
    if(arr[0]==map.get(key)){
        ans[index++]=key;
    }
}
return ans;
    }
    public int helper(TreeNode root, HashMap<Integer,Integer>map,int[]arr){
if(root==null)return 0;
  int sum=root.val+helper(root.left,map,arr)+helper(root.right,map,arr);
  map.put(sum,map.getOrDefault(sum,0)+1);
  if(arr[0]<map.get(sum)){
arr[0]=map.get(sum);
arr[1]=1;
  }
  else if(arr[0]==map.get(sum)){
      arr[1]=arr[1]+1;
  }
  
  return sum;
    }
}
