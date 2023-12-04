import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
        	int sum = 0;
        	ArrayList<Integer> list = new ArrayList<Integer>();
        	int n = Integer.parseInt(br.readLine());
        	if (n == -1) break;
        
            for (int i = 1; i <= n/2; i++) {
                if (n % i == 0) {
                	list.add(i);
                	sum += i;
                }
                //System.out.print(list);
            }
            
            if(sum == n) {
                System.out.print(n + " = ");
                for(int i = 0; i< list.size()-1; i++) {
                    System.out.print(list.get(i) + " + ");
                }
                System.out.println(list.get(list.size()-1));
            } else {
            	System.out.println(n + " is NOT perfect.");
            }
        }
    }
}