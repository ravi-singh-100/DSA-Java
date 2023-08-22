// Ques:https://leetcode.com/problems/find-largest-value-in-each-tree-row/

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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>li=new ArrayList<>();
        if(root==null) return li;
        Queue<TreeNode>q=new LinkedList<>();
        int max=Integer.MIN_VALUE;
        q.add(root);
        while(q.size()>0){
            int s=q.size();
            while(s-->0){
                TreeNode temp=q.remove();
                max=Math.max(max,temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null) {
                    q.add(temp.right);
                }
            }
            li.add(max);
            max=Integer.MIN_VALUE;
        }
        return li;
    }
}
