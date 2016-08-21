import java.util.Scanner;


public class Main
{
	static int max(int a,int b)
	{
		return (a>b)? a: b;
	}
	static int knapSack(int W,int wt[],int val[],int n)
	{
		int i,j;
		int [][]dp=new int[n+1][W+1];
		for(j=0;j<=W;j++)
		{
			dp[n][j]=0;
		}
		for(i=n-1;i>=0;i--)
		{
			for(j=0;j<=W;j++)
			{
				if(j>=wt[i])
				{
					dp[i][j]=max(dp[i+1][j],val[i]+dp[i+1][j-wt[i]]);
				}
				else
				dp[i][j]=dp[i+1][j];
			}
		}
		return dp[0][W];
	}
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int W=sc.nextInt();
			int n=sc.nextInt();
			int []wt=new int[n];
			int []val=new int[n];
			for(int p=0;p<n;p++)
			{
				 wt[p]=sc.nextInt();
				 val[p]=sc.nextInt();
			}
			System.out.println("Hey stupid robber, you can get "+knapSack(W,wt,val,n)+".");
		}
		
	}
}