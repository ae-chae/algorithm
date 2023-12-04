import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //int i = 0;
        
        if(n == 1) System.out.println(" ");
        
        for(int i = 2; i <= n; i++) {
        	//i = 2;
        	if(n%i == 0) {
        		System.out.println(i);
        		n = n / i;
        		//System.out.println(n);
        		i--;
        	}
        }
    }
}
