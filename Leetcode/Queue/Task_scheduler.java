// Ques:https://leetcode.com/problems/task-scheduler/

class Pair{
    int val;
    int time;
}
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int count=0;
        int []arr=new int[26];
        for(char ch:tasks){
            arr[ch-'A']++;
        }
        Queue<Pair>q=new LinkedList<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b) -> b-a);
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                pq.add(arr[i]);
            }
        }
        int num=-1;
        while(pq.size()>0||q.size()>0){
   num=pq.size()>0?pq.poll():-1;
   
               count++;

            if(num-1>0){
    Pair obj=new Pair();
            obj.val=num-1;
            obj.time=count+n;
            q.add(obj);
          
            }
        
            if(q.size()>0&&count==q.peek().time){
                Pair temp=q.remove();
                pq.add(temp.val);
             
            }
         
        }
        return count;
    }
}
