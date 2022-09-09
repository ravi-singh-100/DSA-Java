// Quews:https://leetcode.com/problems/reordered-power-of-2/

class Solution {
    public boolean reorderedPowerOf2(int n) {
int []nfrequency=count(n);
        for(int i=0;i<31;++i){
            int[]power2frequency=count((int)Math.pow(2,i));
            if(check(nfrequency,power2frequency))
                return true;
        }
        return false;
    }
    public int[]count(int n){
        int []arr=new int[10];
        while(n>0){
            arr[n%10]++;
            n/=10;
        }
        return arr;
    }
    public boolean check(int[]arr1,int[]arr2){
        for(int i=0;i<arr1.length;++i){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}
