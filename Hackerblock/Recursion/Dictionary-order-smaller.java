// Ques:https://hack.codingblocks.com/app/contests/3140/1063/problem

import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
        String str=in.next();
        String original=new String(str);
        ArrayList<String>list=new ArrayList<>();
        print(str,"",list,original);
        Collections.sort(list);
      for(String var:list) {
    	  System.out.println(var);
      }
    }
   
    public static void print(String str,String ans,ArrayList<String>list,String original){
        if(str.length()==0){
        	if(!ans.equals(original))
        list.add(ans);
            return;
        }
        for(int i=0;i<str.length();++i){
        	if(isLexicographical(ans,original))
            print(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i),list,original);
        }    	
    }
    public static boolean isLexicographical(String ans,String original) {
    	for(int i=0;i<ans.length();++i) {
    		if(ans.charAt(i)<original.charAt(i))
                 return true;
    		else if(ans.charAt(i)>original.charAt(i))
            return false;
    	}
    	return true;
    
    }
}
