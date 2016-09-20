import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
    Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		for(int j=1;j<=s.length()-i;j++)
		{
			String substr=s.substring(i,i+j);
			long n=substr.chars().distinct().count();
			long nCr=combination(n,2);
			if(nCr==k)
			count=count+1;
			
		}
		}
		System.out.println(count);
	}
		public static long combination(long n, long r){
    if(n < r)
        return 0;
    if(r == 0 || r == n)
        return 1;
    return combination(n-1,r-1)+combination(n-1,r);
    }
 
