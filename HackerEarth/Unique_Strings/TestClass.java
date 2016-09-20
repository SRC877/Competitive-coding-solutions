import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception{
    	Scanner sc=new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0)
    	{
    		String str=sc.next();
    		Set<Character> seen=new HashSet<Character>();
    		StringBuilder sb=new StringBuilder();
    		
    		for(int i=0;i<str.length();i++)
    		{
    			char ch=str.charAt(i);
    			if(!seen.contains(ch))
    			{
    				seen.add(ch);
    				sb.append(ch);
    			}
    		}
    		System.out.println(sb.toString());
    	}
    }
}