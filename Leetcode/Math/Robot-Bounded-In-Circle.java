// Ques:https://leetcode.com/problems/robot-bounded-in-circle/description/

class Solution {
    public boolean isRobotBounded(String instructions) {
       char curDir='N';
       int x=0;
       int y=0;
     for(char ch:instructions.toCharArray()){
         if(ch=='G'){
             if(curDir=='N')
             y+=1;
             else if(curDir=='E')
           x+=1;
           else if(curDir=='W')
           x-=1;
           else
           y-=1;
         }
         else{
             if(curDir=='N')
             curDir=(ch=='L')?'W':'E';
             else if(curDir=='W')
             curDir=(ch=='L')?'S':'N';
             else if(curDir=='E')
             curDir=(ch=='L')?'N':'S';
             else
             curDir=(ch=='L')?'E':'W';
         }
     }   
     return ((x==0&&y==0)||curDir!='N');
    }
}
