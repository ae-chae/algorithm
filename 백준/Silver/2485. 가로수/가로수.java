import java.util.*;
import java.io.*;

public class Main {
	public static long GCD(long x, long y) {
        if(y == 0) {
            return x;
        }
        else {
            return GCD(y, x % y);
        }
    }
	
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] arrA = new int[n-1];
        
        for(int i = 0; i<n; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i = 0; i<n-1; i++) {
        	arrA[i] = arr[i+1] - arr[i];
        }
        
        long a = GCD(arrA[0], arrA[1]);
        long b = 0;
        
        for(int i = 2; i<n-1; i++) {
        	b = GCD(a, arrA[i]);
        	a = b;
        }
        
        if(n == 3) b = a;
        
        int c = (int)b;
        int count = 0;
        if(c == 0) {
        	System.out.print(0);
        	System.exit(0);
        }
        
        else {
        	//System.out.println(c);
        	count = ((arr[n-1] - arr[0])/c) - (n - 1);
        	System.out.print(count);
        }
        
	}

}
