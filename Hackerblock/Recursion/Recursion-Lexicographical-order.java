// Ques: https://hack.codingblocks.com/app/contests/3140/508/problem

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
               Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       for(int i=0;i<10;++i) {
    	    print(n,i,""+i+" ");
//    	    System.out.print(""+i+" ");
       }
   
       
    
}
    public static void print(int n,int next_num,String ans) {
//    	int flag=1;
    	if(next_num>n) {
    		return;
    	}if(next_num==0) {
    		System.out.print(ans);
    		return;
    	}
    	else {
    		System.out.print(ans);
    	}
    	for(int i=0;i<10;++i) {
    		String num="";
    		int next=next_num;
    		num+=Integer.toString(next)+Integer.toString(i);
    		int faltu=Integer.parseInt(num);
    		if(faltu<=n){
    			print(n,faltu,faltu+" ");
    		}
    	}


        
    }
}
