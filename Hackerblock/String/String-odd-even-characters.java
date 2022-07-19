// Ques: Take as input S, a string. Write a function that replaces every even character with the character having just higher ASCII code and every odd character with the character having just lower ASCII code. Print the value returned.


import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in=new Scanner(System.in);
    String str=in.next();
    String ans="";
    for(int i=0;i<str.length();++i){
        if(i%2==0){
ans+=(char)(str.charAt(i)+1);
        }
        else{
ans+=(char)(str.charAt(i)-1);
        }
    }
    System.out.println(ans);
    }
}
