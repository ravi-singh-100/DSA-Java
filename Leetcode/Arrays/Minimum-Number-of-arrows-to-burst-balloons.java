// Ques: https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
    int arrow=0;
        
        for(int i=0;i<points.length;++i){
            arrow+=1;
            int flag=0;
            int end=points[i][1];
            while(i<points.length-1&&end>=points[i+1][0]){
                ++i;
              
            }
        
            
        }
        return arrow;
    }
}
