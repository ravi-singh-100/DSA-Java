// Ques:https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

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
    public TreeNode sortedArrayToBST(int[] nums) {
    return helper(nums,0,nums.length-1);
    }
    public TreeNode helper(int[]nums,int start,int end){
        if(start>end)return null;
            TreeNode n=new TreeNode();
        int mid=start+(end-start)/2;
    
n.val=nums[mid];
n.left=helper(nums,start,mid-1);
n.right=helper(nums,mid+1,end);
return n;
    }
}
