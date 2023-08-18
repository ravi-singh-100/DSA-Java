// Ques:https://leetcode.com/problems/n-ary-tree-level-order-traversal/

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
    public List<List<Integer>> levelOrder(Node root) {
            List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
    while(!q.isEmpty()){
List<Integer>li=new ArrayList<>();
int size=q.size();
while(size-->0){
    Node temp=q.remove();
li.add(temp.val);
  List<Node> children = temp.children;
for(Node child:children){
q.add(child);
}
}
ans.add(li);
    }
    return ans;
        
    }
}
