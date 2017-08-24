import java.util.*;

class Happy_Number {
	public static void main (String[] args) {
		Scanner sr=new Scanner(System.in);
		int n=sr.nextInt();
		while(n>1){
		    n=pass(n);
		}
		if(n==1)
		System.out.print("Happy Number");
		else
		System.out.print("Unhappy Number");
	}
	public static int pass(int m){ int t=0;
	    String s[]=String.valueOf(m).split("");
	    for(int i=0;i<s.length;i++){
	        int b=Integer.valueOf(s[i]);
	        t=t+(b*b);
	    }
	    return t;
	}
}
