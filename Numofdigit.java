import java.util.*;

class Numofdigit {
	public static void main (String[] args) {
	Scanner sr=new Scanner(System.in);
	int n=sr.nextInt();
	String s[]=String.valueOf(n).split("");
	System.out.println(s.length);
	}
}
