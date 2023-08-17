// Ques:https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>q=new LinkedList<>();
        
      
        q.add(root);
       
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer>li=new ArrayList<>();
while(s-->0){
  TreeNode  temp=q.remove();
li.add(temp.val);
if(temp.left!=null){
    q.add(temp.left);
}
if(temp.right!=null){
    q.add(temp.right);
}

}
ans.add(li);
        }
      
Collections.reverse(ans);
        return ans;
    }
}
