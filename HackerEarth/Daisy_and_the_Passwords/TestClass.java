import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuffer;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
        	String str=sc.next();
        	String str1=sc.next();
        	
        	int flag=0;
        	for(int c=0;c<=str.length();c++)
        	{
        		StringBuffer sb=new StringBuffer(str);
        		sb.insert(c,str);
        		if(sb.toString().equals(str1))
        		flag=1;
        		
        	}
        	if(flag==1)
        	System.out.println("Possible");
        	else
        		System.out.println("Impossible");
        }
        
 
        
    }
}
