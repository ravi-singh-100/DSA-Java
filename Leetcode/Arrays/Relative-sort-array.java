// Ques:https://leetcode.com/problems/relative-sort-array/description/

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
  int[]count=new int[1001];
  int n=arr2.length;
  for(int i:arr1){
count[i]++;
  }
  int k=0;
  for(int i=0;i<n;i++){
      while(count[arr2[i]]-->0){
          arr1[k]=arr2[i];
          k++;
      }
  }
  for(int i=0;i<count.length;i++){
      while(count[i]-->0){
          arr1[k++]=i;
      }
  }
  return arr1;
    }
}
