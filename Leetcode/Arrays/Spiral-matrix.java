// Ques: https://leetcode.com/problems/spiral-matrix/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       ArrayList<Integer>li=new ArrayList<>();
        int Minrow=0;
	int Mincol=0;
	int Maxrow=matrix.length-1;
	int Maxcol=matrix[Maxrow].length-1;
        int count=0;
	while((Minrow<=Maxrow)&&(Mincol<=Maxcol)) {
		//MOVE RIGHT
			for(int j=Mincol;j<=Maxcol&&count<(matrix.length*matrix[0].length);++j) {
              
                    li.add(matrix[Minrow][j]);
                    ++count;
                
               
			
		}
			++Minrow;

	//MOVE DOWN

		for(int j=Minrow;j<=Maxrow&&count<(matrix.length*matrix[0].length);++j) {
         
                li.add(matrix[j][Maxcol]);
                ++count;
            
            
		}
		--Maxcol;

	//MOVE LEFT

		for(int i=Maxcol;i>=Mincol&&count<(matrix.length*matrix[0].length);--i) {
           
            
                 li.add(matrix[Maxrow][i]);
                ++count;
            
		}
		--Maxrow;
	//MOVE UP
		for(int i=Maxrow;i>=Minrow&&count<(matrix.length*matrix[0].length);--i) {
           
                   li.add(matrix[i][Mincol]);
                ++count;
            
         
		}
		++Mincol;
	}
        return li;
    }
}
