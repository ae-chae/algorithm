import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int count = 0;
        
        Set<String> s = new HashSet<String>();
        for(int i = 0; i < n; i++){
            s.add(br.readLine());
        }

        for(int i = 0; i < m; i++){
            if(s.contains(br.readLine())) count++;
        }
        System.out.println(count);
    }
}
