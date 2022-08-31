// Ques:https://leetcode.com/problems/count-number-of-teams/

class Solution {
    public int numTeams(int[] rating) {
        int count=0;
      for(int i=1;i<rating.length-1;++i){
          int smallLeft=0;
          int bigRight=0;
          int bigLeft=0;
          int smallRight=0;
          int ptr=i-1;
          while(ptr>=0){
              if(rating[i]>rating[ptr]){
                  ++smallLeft;
                  
              }
              if(rating[i]<rating[ptr]){
                  ++bigLeft;
              }
              --ptr;
          }
          ptr=i+1;
          while(ptr<rating.length){
              if(rating[i]>rating[ptr]){
                  smallRight++;
              }
              if(rating[i]<rating[ptr]){
                  bigRight++;
              }
              ++ptr;
          }
          count+=(smallLeft*bigRight)+(bigLeft*smallRight);
      }
        return count;
    }
}
