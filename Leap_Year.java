import java.util.*;

class Leap_Year {
	public static void main (String[] args) {
	Scanner sr=new Scanner(System.in);
	int n=sr.nextInt();
	if((n%4)==0)
	System.out.println("Leap year");
	else
	System.out.println("Not a Leap year");
	}
}
