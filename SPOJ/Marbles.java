import java.util.Scanner;

class Marbles {
 
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); sc.nextLine();
        
        while (t -- > 0) 
           {
            long n = sc.nextInt(); 
            long r = sc.nextInt(); 
            sc.nextLine();
            long x = n - 1;
            long num = 1;
            long y = ((r-1)>(n-r)) ? (r-1) : (n-r);
            long indx = 0;
            for (long i = x; i > y; i --) {
                indx++;
                num = num*i;
                num = num / indx;
            }
            System.out.println(num);
        }
    }
    
}  