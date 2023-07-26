// Ques:https://leetcode.com/problems/game-of-life/description/
class Solution {
    public void gameOfLife(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
int nei=neighbour(board,i,j);
if(board[i][j]==0&&(nei==3)){
board[i][j]=2;
}
else if((nei>3||nei<2)&&board[i][j]==1){
    board[i][j]=-1;
}
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==-1){
                    board[i][j]=0;
                }
                else if(board[i][j]==2){
                    board[i][j]=1;
            }
            }
        }
        
    }
    public int neighbour(int[][]board,int r,int c){
        int count=0;
        if(r-1>=0&&Math.abs(board[r-1][c])==1){
            count++;
        }
        if(r+1<board.length&&Math.abs(board[r+1][c])==1){
            count++;
        }
        if(c+1<board[0].length&&Math.abs(board[r][c+1])==1){
            count++;
        }
         if(c-1>=0&&Math.abs(board[r][c-1])==1){
            count++;
        }
        if(c+1<board[0].length&&r-1>=0&&Math.abs(board[r-1][c+1])==1){
            count++;
        }
        if(r+1<board.length&&c+1<board[0].length&&Math.abs(board[r+1][c+1])==1){
            count++;
        }
        if(r+1<board.length&&c-1>=0&&Math.abs(board[r+1][c-1])==1){
            count++;
        }
        if(r-1>=0&&c-1>=0&&Math.abs(board[r-1][c-1])==1){
            count++;
        }
        return count;
    }
}
