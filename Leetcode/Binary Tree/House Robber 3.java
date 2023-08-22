// Ques:https://leetcode.com/problems/house-robber-iii/

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
  class Pair{
    int with=0;
    int without=0;
  }
    public int rob(TreeNode root) {
    Pair obj= helper(root);
    return Math.max(obj.with,obj.without);
    }
    public Pair helper(TreeNode root){
      if(root==null)return new Pair();
      Pair left=helper(root.left);
      Pair right=helper(root.right);
      Pair ans=new Pair();
      ans.with=root.val+left.without+right.without;
      ans.without=Math.max(left.without,left.with)+Math.max(right.without,right.with);
      return ans;
    }
}
