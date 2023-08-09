// Ques:https://leetcode.com/problems/count-numbers-with-unique-digits/

class Solution {
    public int countNumbersWithUniqueDigits(int n) {
       int[]arr=new int[n+1];
       arr[0]=1;
       if(arr.length>1)
       arr[1]=10;
       if(n==0||n==1) return arr[n];
     int i=2;
      while(i<=n){

int mul=9;int num=9;
           for( int j=i;j>1;j--){
     mul*=num;
           System.out.println(mul);
           num--;
           }
       
 arr[i]=mul+arr[i-1];
 System.out.println("kjabfjad"+arr[i]);
 i++;
       } 

       return arr[n];
      
    }
}
