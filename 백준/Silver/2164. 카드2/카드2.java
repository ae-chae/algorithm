import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        int x = 0;
        for (int i = 1; i<=n; i++) {
            q.add(i);
        }

        if(n == 1){
            x = 1;
        } else {
            while (q.size() > 1) {
                q.poll();
                q.add(q.peek());
                q.poll();
                if(q.size() == 1) {
                    x = q.peek();
                    break;
                }
            }
        }
        System.out.println(x);
    }
}