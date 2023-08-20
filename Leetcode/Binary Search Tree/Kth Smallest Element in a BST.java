// Ques:https://leetcode.com/problems/kth-smallest-element-in-a-bst/

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
    public int kthSmallest(TreeNode root, int k) {
           PriorityQueue<Integer>q=new PriorityQueue<>((a,b) -> b-a);
        helper(q,root,k);
      
        return q.peek();
    }
    public void helper(PriorityQueue<Integer>q,TreeNode root, int k){
        if(root==null)return;
    if(q.size()<k){
        q.add(root.val);
   
    }
    else if(q.size()==k&&q.peek()>root.val){
q.poll();
q.add(root.val);
 
    }
    helper(q,root.left,k);
    helper(q,root.right,k);
  
    }
}
