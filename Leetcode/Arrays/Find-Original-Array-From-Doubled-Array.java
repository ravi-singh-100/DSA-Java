// Ques:https://leetcode.com/problems/find-original-array-from-doubled-array/

class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        if(changed.length%2==1)
            return new int[0];
        int index=0;
        // ArrayList<Integer>li=new ArrayList<>();
        int ans[]=new int[changed.length/2];
        int[]fre=new int[100001];
        // Arrays.sort(changed);
        for(int i:changed){
            fre[i]++;
        }
        for(int i=0;i<fre.length;++i){
               while(fre[i]>0&&i*2<100001&&fre[i*2]>0){
                   fre[i]--;
                fre[i*2]--;
                     ans[index++]=i;
                
                         
            }
        }
        for(int i:fre){
            if(i>0)
                return new int[0];
        }
      
        return ans;
    }
}
