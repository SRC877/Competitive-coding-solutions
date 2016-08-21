import java.util.Scanner;
import java.math.BigInteger;

class Soldier
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BigInteger r,c,a,b;
	    BigInteger two = new BigInteger("2");
		BigInteger zero = new BigInteger("0");
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-- > 0) {
		    r = sc.nextBigInteger();
			c = sc.nextBigInteger();
			if((r.remainder(two)).equals(zero)) 
				a = r.divide(two);
			else
				a = (r.add(BigInteger.ONE)).divide(two);
			if((c.remainder(two)).equals(zero)) 
				b = c.divide(two);
			else
				b = (c.add(BigInteger.ONE)).divide(two);
			r = r.multiply(b);
			c = c.multiply(a);
			if( r.compareTo(c) == 1)
				System.out.println(r);
			else
				System.out.println(c);
		}
	}
}
