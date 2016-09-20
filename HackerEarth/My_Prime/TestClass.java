import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/
 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S[]=new int[N];
        int count;
     for (int p = 0; p<N; p++) 
       {
            S[p]=sc.nextInt();
        }
        
        for(int i=0;i<N;i++)
        {
         	count=0;
        	for(int j=0;j<N;j++)
        	{
        		if(S[i]% S[j]==0 && S[i]!=S[j])
        		{
        		count++;
        		break;
        		}
        		
        	}
        
        	if(count==0)
        	{
        		System.out.print(S[i]+" ");
        	}
        }
        
    }
}
