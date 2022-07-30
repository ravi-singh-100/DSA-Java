Ques: 

import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner in=new Scanner(System.in);
	 int n=in.nextInt();
	 int []arr1=new int[n];
	 for(int i=0;i<n;++i){
	     arr1[i]=in.nextInt();
	 }
	 int m=in.nextInt();
	 int []arr2=new int[m];
	 for(int i=0;i<m;++i){
	     arr2[i]=in.nextInt();
	 }
	 int i=arr1.length-1;
	 int j=arr2.length-1;
	 // int sum=0;
	 int carry=0;
	 ArrayList<Integer>list=new ArrayList<>();

	 while(i>=0&&j>=0){
		 if(i==0&j==0) {
			 list.add(0,(carry+arr1[i]+arr2[j])%10);
			 carry=(carry+arr1[i]+arr2[j])/10;
             if(carry>0)
			 list.add(0,carry);
		 }
		 else {
			 list.add(0,(carry+arr1[i]+arr2[j])%10);
			 carry=(carry+arr1[i]+arr2[j])/10; 
		 }
	
	     --j;
	     --i;
	 }
	 while(i>=0){
		 if(i==0) {
			  list.add(0,(carry+arr1[i])%10);
			     carry=(arr1[j]+carry)/10;
                 if(carry>0)
			  list.add(0,carry);
		 }
		 else {
			  list.add(0,(carry+arr1[i])%10);
			     carry=(arr1[j]+carry)/10; 
		 }
	   
	     --i;
	 }
	 while(j>=0){
		 if(j==0) {
			  list.add(0,(carry+arr2[j])%10);
			     carry=(arr1[j]+carry)/10;
                 if(carry>0)
			     list.add(0,carry);
		 }
		 else {
			 list.add(0,(carry+arr2[j])%10);
		     carry=(arr2[j]+carry)/10;
		 }
	    
	     --j;
	 }
	 for(int v: list){
	     System.out.print(v+", ");
     
	 }
	 System.out.println("END");
    }
}
