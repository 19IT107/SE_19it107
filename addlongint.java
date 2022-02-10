import java.util.*;
public class addlongint{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter 1st float number");
		float n1=s.nextFloat();
		System.out.println("enter 2nd float number");
		float n2=s.nextFloat();
		int n3=(int)(n1+n2);
		long n4=(long)n3;
		System.out.println("the addition in long int is :"+ n3);
		
	}
}