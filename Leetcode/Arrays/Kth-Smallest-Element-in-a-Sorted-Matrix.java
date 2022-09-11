// Ques: https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
return search(matrix,k,matrix[0][0],matrix[matrix.length-1][matrix.length-1]);
    }
    public  int  search(int[][]matrix,int k,int low,int high){
        while(low<=high){
            int mid=(low+high)/2;
            
            if(count(mid,matrix)<k){
                low=mid+1;
            }
            
            else{
               high=mid-1;
            }
        }
     return low;
    }
    public int count(int num,int[][]matrix){
        int i=0;
        int c=0;
        
        
        while(i<matrix.length){
            int col=matrix.length-1;
            while(col>=0&&matrix[i][col]>num){
                --col;
            }
            c+=col+1;
            ++i;
        }
        return c;
    }
}
