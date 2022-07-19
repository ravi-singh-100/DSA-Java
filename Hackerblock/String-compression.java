// Ques: Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2d1s1.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
String str=in.next();
String ans="";
for(int i=0;i<str.length();++i){
    ans+=str.charAt(i);
    int count=1;
    
    while(i<str.length()-1&&str.charAt(i+1)==str.charAt(i)){
        ++count;
        ++i;
    }
    ans+=count;
}
System.out.println(ans);
    }
}
