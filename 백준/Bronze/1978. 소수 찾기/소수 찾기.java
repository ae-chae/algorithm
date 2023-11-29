import java.util.*;
public class Main {
    public static boolean isPrime(int n) {
        if (n == 1) return false;
        else if(n == 2) return true;

        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (isPrime(num)){
                count++;
            }
        }
        System.out.print(count);
    }
}
