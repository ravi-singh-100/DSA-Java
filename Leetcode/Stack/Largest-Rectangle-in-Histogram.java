// Ques:https://leetcode.com/problems/largest-rectangle-in-histogram/

class Solution {
    public int largestRectangleArea(int[] heights) {
       // Stack<Integer>st=new Stack<>();
        	int max=0;
	Stack<Integer> st=new Stack<>();
	for(int i=0;i<heights.length;++i) {
		while(!st.isEmpty()&&heights[i]<heights[st.peek()]) {
			int h=heights[st.pop()];
			int r=i;
			if(!st.isEmpty()) {
				int l=st.peek();
				max=Math.max(max, h*(r-l-1));
			}
			else {
				max=Math.max(max,h*r);
			}
		}
		st.push(i);
	}
	int r=heights.length;
	while(!st.isEmpty()) {
		int h=heights[st.pop()];
		if(!st.isEmpty()) {
			int l=st.peek();
			max=Math.max(max,h*(r-l-1));
		}
		else {
			max=Math.max(max, h*r);
		}
	}
        return max;
    }
}
