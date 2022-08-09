// Ques: Google Tower of Hanoi

package recursion;

public class Tower_of_hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=3;
String source="A";
String help="B";
String des="C";
toh(n,source,help,des);
	}
public static void toh(int n,String source,String help,String des) {
	if(n==0)
		return ;
	//Move n-1 disc from source to help
	toh(n-1,source,des,help);
	System.out.println("Move "+ n+"th disc from "+source+" to "+ des);
	toh(n-1,help,source,des);
	
}
}
