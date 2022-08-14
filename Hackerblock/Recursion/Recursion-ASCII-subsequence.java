// Ques:ake as input str, a string. We are concerned with all the possible ascii-subsequences of str. E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int c=print(str,"");
        System.out.println();
        System.out.print(c);
    }
    public static int print(String str,String ans){
if(str.length()==0){
    System.out.print(ans+" ");
    return 1;
}

int c1=print(str.substring(1),ans);
int c2=print(str.substring(1),ans+str.charAt(0));
int c3=print(str.substring(1),ans+(int)(str.charAt(0)));
return c1+c2+c3;
    }
}
