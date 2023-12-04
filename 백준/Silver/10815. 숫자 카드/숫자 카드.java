import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> s = new HashSet<Integer>();

        for(int i = 0; i < n; i++){
            s.add(Integer.parseInt(st.nextToken()));
        }

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            if(s.contains(Integer.parseInt(st.nextToken()))) System.out.print(1+" ");
            else System.out.print(0+" ");
        }

    }
}