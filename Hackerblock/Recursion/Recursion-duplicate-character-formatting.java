// Ques: Take as input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are separated by a ‘ * ’. E.g. for “hello” return “hel*lo”. Print the value returned

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(changeDuplicate(str,""));

    }
    public static String changeDuplicate(String str,String ans){
        if(str.length()==0)
        return ans;
          if(str.length()>1&&str.charAt(0)==str.charAt(1))
        {
             return changeDuplicate(str.substring(1),ans+str.charAt(0)+"*");
              
        }
          return changeDuplicate(str.substring(1),ans+str.charAt(0));
        
      
     
    }
}
