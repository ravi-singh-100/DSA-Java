// Ques: https://hack.codingblocks.com/app/contests/3140/145/problem

import java.util.*;
public class Main {
    public static void main(String args[]) {
   		Scanner  in=new Scanner(System.in);
		String str=in.next();
//		String original=new String(str);
		ArrayList<String>list =new ArrayList<>();
		print(str,"",list);
		System.out.println(list);
}
	public static void print(String str,String ans,ArrayList<String>list) {
		if(str.length()==0) {
//			System.out.println(ans+" ");
			list.add(ans);
			return;
		}
		for(int i=0;i<str.length();++i) {
			if(Integer.parseInt(str.substring(0,i+1))>=1&&Integer.parseInt(str.substring(0,i+1))<=26) {
				int temp=Integer.parseInt(str.substring(0,i+1));
//				System.out.println("temp "+temp);
				char ch=(char)(temp+96);
//				System.out.println("i+1 "+str.substring(i+1)+"      "+ans+ch);
				print(str.substring(i+1),ans+ch,list);
			}
			
		}
       
    }
}
