// Ques:https://leetcode.com/problems/exclusive-time-of-functions/

class Solution {
    static class Pair{
        int id;
        int st;
        int child;
        Pair(int id,int st,int child){
this.id=id;
this.st=st;
this.child=child;
        }
    }

    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Pair>st=new Stack<>();
        int[]ans=new int[n];

        for(int i=0;i<logs.size();i++){
      String  s=logs.get(i);
        String[]log=s.split(":");
        System.out.println(Arrays.toString(log));
if(log[1].equals("start")){
Pair obj=new Pair(Integer.parseInt(log[0]),Integer.parseInt(log[2]),0);
st.push(obj);
}
else{
Pair p=st.pop();
int time=Integer.parseInt(log[2])-p.st+1;
int interval=time-p.child;
ans[p.id]+=interval;
if(st.size()>0){
    st.peek().child+=time;
}
}

        }
return ans;
    }
}
