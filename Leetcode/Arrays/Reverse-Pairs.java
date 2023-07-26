// Ques:https://leetcode.com/problems/reverse-pairs/description/
class Solution {

    public int reversePairs(int[] nums) {
			if(nums.length==1) return 0;
			int []delete={0};
		
     int[] ans = mergesort(nums, 0, nums.length - 1,delete);
		return ans[0];
	}

	public static int[] mergesort(int[] arr, int lo, int hi,int[] x) {
	
		if (lo == hi) {
			int[] a = new int[1];
			a[0] = arr[lo];
			return a;
		}

		int mid = (lo + hi) / 2;

		int[] fs = mergesort(arr, lo, mid,x);
		int[] ss = mergesort(arr, mid + 1, hi,x);
int j=0;
for(int i=0;i<fs.length;i++){
    while(j<ss.length&&(fs[i]>2*(long)ss[j])){
        ++j;
x[0]+=(fs.length-i-1);
			x[0]=x[0]+1;
    }
}


		int []temp= Merge_TwoSorted_Array(fs, ss);
		if(temp.length==arr.length){
			return x;
		}
		return temp;

	}

	public static int[] Merge_TwoSorted_Array(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n + m];
		int i = 0;// arr1
		int j = 0;// arr2
		int k = 0;// ans

		while (i < n && j < m) {

			if (arr1[i] <= arr2[j]) {
				ans[k] = arr1[i];
				k++;
				i++;
			} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}

		}
		while (i < n) {
			ans[k] = arr1[i];
			k++;
			i++;
		}

		while (j < m) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;

	}
}
