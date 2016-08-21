import java.io.*;
import java.util.*;
class Solution {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		StringBuilder string = new StringBuilder();
		String line = sc.nextLine().toLowerCase();
		while(!line.equals("*")){
			String[] words = line.split(" ");
			boolean flag = true;
			char ch = words[0].charAt(0);
			if(words.length == 1){
				string.append("Y\n");
			}else{
				for(int x = 1; x < words.length; x++){
					if(words[x].charAt(0) != ch){
						flag = false;
					}
				}
				if(flag){
					string.append("Y\n\n");
				}else{
					string.append("N\n\n");
				}
			}
			line = sc.nextLine().toLowerCase();
		}
		
		System.out.println(string);
	}	
}	