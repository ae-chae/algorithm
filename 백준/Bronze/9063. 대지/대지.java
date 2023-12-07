import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TreeSet<Integer> setX = new TreeSet<Integer>();
        TreeSet<Integer> setY = new TreeSet<Integer>();

        for(int i = 0; i< n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            setX.add(x);
            setY.add(y);
        }

        System.out.println((setX.last()- setX.first())*(setY.last()- setY.first()));
    }
}
