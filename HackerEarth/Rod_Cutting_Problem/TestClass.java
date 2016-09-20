import java.util.Scanner;
import java.math.BigInteger;
 
 class MyRecursion
	{
	    BigInteger two=new BigInteger("2");
	    public boolean MyRecursion (BigInteger n)
	    {
	    BigInteger p=n.remainder(two);
		if(p.equals(BigInteger.ZERO))
		return false;
		else if(n.equals(BigInteger.ONE))
		 return true;
		 else
		 return MyRecursion(n.divide(two));
	    }
	}
	
	class Testclass
   {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		BigInteger count;
		for(int i=0;i<t;i++)
		{
			count=new BigInteger("0");
			BigInteger N=sc.nextBigInteger();
			MyRecursion m=new MyRecursion();
			for(BigInteger bi=BigInteger.valueOf(1);bi.compareTo(N)<=0;bi=bi.add(BigInteger.ONE))
			{
			if(m.MyRecursion(bi))
			count=count.add(BigInteger.ONE);
			}
			System.out.println(count.subtract(BigInteger.ONE));
		}
	}
}