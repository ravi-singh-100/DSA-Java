// Ques: https://leetcode.com/problems/merge-sorted-array/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
 int ptr=m+n-1;
      int ptr1=m-1;
    int ptr2=n-1; 
    while(ptr1>=0&&ptr2>=0){
        if(nums1[ptr1]>nums2[ptr2]){
            nums1[ptr]=nums1[ptr1];
            --ptr;
            --ptr1;
            
        }
        else if(nums1[ptr1]<nums2[ptr2]){
            nums1[ptr]=nums2[ptr2];
            --ptr;
             --ptr2;
        }
        else{
            nums1[ptr]=nums1[ptr1];
            --ptr;
            --ptr1;
            nums1[ptr]=nums2[ptr2];
            --ptr;

            --ptr2;

        }
    }
    while(ptr2>=0){
        nums1[ptr]=nums2[ptr2];
        --ptr2;
        --ptr;
    }
    while(ptr1>=0){
        nums1[ptr]=nums1[ptr1];
    --ptr1;
    --ptr;
    }
    }
}
