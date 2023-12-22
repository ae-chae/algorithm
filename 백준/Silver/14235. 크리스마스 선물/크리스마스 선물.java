import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            if(x == 0) {
                if(pq.isEmpty()) System.out.println(-1);
                else {
                    System.out.println(pq.poll());
                }
            } else {
                for(int j = 0; j < x; j++) {
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }
    }
}
