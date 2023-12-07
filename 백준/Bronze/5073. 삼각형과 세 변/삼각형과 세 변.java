import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            int sum = x + y + z;
            int max = Math.max(Math.max(x, y), z);

            if (x + y + z == 0) System.exit(0);
            else {
                if (x == y && y == z) System.out.println("Equilateral");
                else if (max >= (sum-max)) {
                    System.out.println("Invalid"); continue;
                }
                else if (x != y && y != z && x != z) System.out.println("Scalene");
                else System.out.println("Isosceles");
            }
        }
    }
}
