import java.util.Scanner;
import java.lang.*;
import java.math.BigInteger;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BigInteger total,diff,s,a,b;
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			total=sc.nextBigInteger();
			diff=sc.nextBigInteger();
			s=total.subtract(diff);
			a=s.divide(BigInteger.valueOf(2));
			b=total.subtract(a);
			System.out.println(b);
			System.out.println(a);
		}
	}
}