import java.util.*;

class NumPalindrome {
	public static void main (String[] args) {
	Scanner sr=new Scanner(System.in);
	int n=sr.nextInt();String s3="";
	String s1=String.valueOf(n);
	String s[]=s1.split("");
	for(int i=s.length-1;i>=0;i--)
	s3=s3+s[i];
	if(s3.equals(s1))
	System.out.println("its a palindrome");
	else
	System.out.println("Not a palindrome");
	}
}
