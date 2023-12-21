import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int pac = 1001;
        int pie = 1001;
       

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if(a<pac) pac = a;
            if(b<pie) pie = b;
        }

            if(pac > (pie*6)) {
            	System.out.println(pie*n);
            } else if (pac < pie) {
            	if(n%6 != 0) {
            		int x = ((n/6) * pac) + pac;
            		System.out.println(x);
            	} else {
            		int x = ((n/6) * pac);
            		System.out.println(x);
            	}
            } else {
            	if(((n%6) * pie)>pac) {
            		int x = ((n/6) * pac) + pac;
                System.out.println(x);
            	} else {
            		int x = ((n/6) * pac) + ((n%6) * pie);
            		System.out.println(x);
            	}
            }


    }
}