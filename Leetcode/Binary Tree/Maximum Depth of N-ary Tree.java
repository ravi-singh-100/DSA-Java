// Ques:https://leetcode.com/problems/maximum-depth-of-n-ary-tree/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        if(root==null)return 0;
        if(root.children.size()==0)return 1;
        int count=0;
        for(int i=0;i<root.children.size();i++){
            count=Math.max(count,maxDepth(root.children.get(i)));
        }
        return count+1;
    }
}
