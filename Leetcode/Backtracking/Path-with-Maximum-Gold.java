// Ques:https://leetcode.com/problems/path-with-maximum-gold/

class Solution {
    public int getMaximumGold(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;++i){
            for(int j=0;j<grid[0].length;++j){
                if(grid[i][j]>0)
                    count=Math.max(count,func(grid,i,j));
            }
        }
        return count;
    }
    public int func(int [][]grid,int r,int c){
         if(r>=grid.length || c>=grid[0].length || r<0 || c<0 || grid[r][c]==0){
        return 0;
    }
   int temp=grid[r][c];
grid[r][c]=0;
          int c1=func(grid,r,c+1);
           int c2=func(grid,r,c-1);
            int  c3=func(grid,r-1,c);
           int c4=func(grid,r+1,c);
        
grid[r][c]=temp;
        return temp+Math.max(Math.max(Math.max(c1,c2),c3),c4);
    }
}
