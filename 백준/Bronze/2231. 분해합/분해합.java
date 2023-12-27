import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;

        for(int i = 1; i<n; i++) {
            int sum = 0;
            int k = i;
            while(k > 0) {
                sum += k % 10;
                k /= 10;
            }

            sum += i;
            if(sum == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }

}
