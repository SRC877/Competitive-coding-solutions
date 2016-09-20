import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running */
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int count=0;
        for (int i = 5; 1 <= (N/i); i*=5) 
        {
        	count=count+(N/i);
        }
         
         System.out.println(count);
        
 
       
    }
}