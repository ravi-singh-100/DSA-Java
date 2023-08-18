Ques:https://leetcode.com/problems/invert-binary-tree/

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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        helper(root.left,root.right,root);
return root;
    }
    public void helper(TreeNode l,TreeNode r,TreeNode root){
if(l==null&&r==null)return;
        if(l!=null&&r!=null){
        TreeNode temp=l;
        root.left=r;
        root.right=temp;
                helper(root.left.left,root.left.right,root.left);
        helper(root.right.left,root.right.right,root.right);
        return;
        }
         if(r==null){
            root.right=l;
            root.left=null;
        helper(root.right.left,root.right.right,root.right);
        }
        if(l==null){
       root.left=r;
       root.right=null;
  helper(root.left.left,root.left.right,root.left);
        }


    }
}
