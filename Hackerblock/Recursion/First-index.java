// Ques: Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns the first index at which M is found in the array and -1 if M is not found anywhere. Print the value returned

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=in.nextInt();
        }
        int target=in.nextInt();
        System.out.println(search(0,arr,target));
    }
    public static int search(int i,int []arr,int target)
{
    if(i==arr.length)
    return -1;
    else if(arr[i]==target)
    return i;
    return search(i+1,arr,target);

}
}
