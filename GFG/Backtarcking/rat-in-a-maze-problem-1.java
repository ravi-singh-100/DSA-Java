// Ques:https://practice.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String>ans=new ArrayList<>();
        if(m[n-1][n-1]==0||m[0][0]==0){
        ans.add("-1");
        return ans;
        }

        print(ans,0,0,m,n,"");
        return ans;
    }
    public static void print(ArrayList<String>ans,int row,int col,int[][]m,int n,String s){
        if(row==n-1&&col==n-1){
            // if(m[row][col]==0)
            // ans.add("-1");
            // else
            ans.add(s);
            return;
        }
      m[row][col]=0;
       //up
       if(row>0&&m[row-1][col]!=0)
       print(ans,row-1,col,m,n,s+"U");
       //down
       if(row<n-1&&m[row+1][col]!=0)
       print(ans,row+1,col,m,n,s+"D");
       //Left
       if(col>0&&m[row][col-1]!=0)
       print(ans,row,col-1,m,n,s+"L");
       //right
       if(col<n-1&&m[row][col+1]!=0)
       print(ans,row,col+1,m,n,s+"R");
      m[row][col]=1;
    }
}
