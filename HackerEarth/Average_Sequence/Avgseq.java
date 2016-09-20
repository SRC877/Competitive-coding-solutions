import java.util.*;
import java.util.Scanner;
 
class Avgseq{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int sum=0;
		for(int i=1;i<=t;i++)
		{
			int a=0;
			int b=sc.nextInt();
			a=(b*i)-sum;
			sum=sum+a;
			System.out.print(a+" ");
		}
	}
}