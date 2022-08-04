// Ques: https://leetcode.com/problems/diagonal-traverse/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
    
        int i=0;
        int j=0;
        int k=0;
        
        int []ans=new int[mat.length*mat[0].length];
        while(k<mat.length*mat[0].length){
            
//upward direction
     while(i>=0&&j<mat[0].length){

         ans[k]=mat[i][j];
         ++j;
         --i;
         ++k;
     }
if(i<0&&j<mat[0].length){
    i=0;

}
if(j==mat[0].length){
    i+=2;
    j-=1;
}
//Downward Direction
while(j>=0&&i<mat.length){
        ans[k]=mat[i][j];
    ++i;
    --j;
    ++k;
}
if(j<0&&i<mat.length){
    j=0;
}
if(i==mat.length){
    j+=2;
    --i;
}
         
        }
           return ans;
    }
     
    }
