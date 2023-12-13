import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = -1;

        while(true) {
            n = Integer.parseInt(br.readLine());
            if(n == 0) System.exit(0);
            System.out.println(isPrime(n));
        }
    }

    public static int isPrime(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;

        int count = 0;
        for(int j = n+1; j <= 2*n; j++) {
            int sqrt = (int) Math.sqrt(j);
            for (int i = 2; i <= sqrt; i++) {
                if (j % i == 0) {
                    break;
                }

                if(i == sqrt) {
                    count++;
                }
            }
        }

        return count;
    }
}
