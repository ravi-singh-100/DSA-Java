// Ques:https://leetcode.com/problems/delete-node-in-a-bst/description/

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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val<key){
           root.right= deleteNode(root.right,key);
        }
        else if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else{

   if(root.left==null){
        return root.right;
    }
    else if(root.right==null){
        return root.left;
        }
        else{
            int max=Max(root.left);
            root.left=deleteNode(root.left,max);
            root.val=max;
        }
}
  return root;
        }
   
    
    public int Max(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(Max(root.right),root.val);
    }
}
