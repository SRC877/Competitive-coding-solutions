import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
  
        int N=sc.nextInt();
        int W,H;
        if((1<L&& L<10000) && (1<N && N<1000))
        {
        for(int i=0;i<N;i++)
        {
        	
        	W=sc.nextInt();
            H=sc.nextInt();
            if((1<W && W<10000)&& (1<H && H<10000))
            {
        	
        	if((W<L) ||(H<L))
        	{
        	System.out.println("UPLOAD ANOTHER");
        	}
        	else 
        	if (W==H)
        	{
        	System.out.println("ACCEPTED");
        	}
        	else
        	{
        	System.out.println("CROP IT");
        	}
            }
            
        }
        }
 
        
    }
}
