// Ques:https://leetcode.com/problems/angle-between-hands-of-a-clock/description/

class Solution {
    public double angleClock(int hour, int minutes) {
  double h=(hour+minutes/60.0)*30;
 double m=minutes*6;
 System.out.println(m-h);
   if(Math.abs(m-h)<=180)
   return (double)Math.abs(m-h);
   else return (double)(360-Math.abs(m-h));
    }
}
