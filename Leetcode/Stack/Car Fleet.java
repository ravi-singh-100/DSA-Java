// Ques:https://leetcode.com/problems/car-fleet//

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
       if(position.length==1)return 1;
       double [][]time=new double[speed.length][2];
        for(int i=0;i<time.length;i++){
            time[i][0]=position[i]*1d;
             time[i][1]=((target-position[i])*1d)/speed[i];
        }
       Arrays.sort(time, (a, b) -> Double.compare(a[0], b[0]));
        Stack<Double>st=new Stack<>();
        int fleet=0;
        for(double []i:time){
            if(!st.isEmpty()&&st.peek()<=i[1]){          
 while(!st.isEmpty()&&st.peek()<=i[1]){
     st.pop();
 }
 st.push(i[1]);
            }
            else{
     st.push(i[1]);
 }
           
        }
        while(!st.isEmpty()){
            st.pop();
            fleet++;
        }
        return fleet;
    }
}
