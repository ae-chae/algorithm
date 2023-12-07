import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aUp = sc.nextInt();
        int aDown = sc.nextInt();
        int bUp = sc.nextInt();
        int bDown = sc.nextInt();

        int cUp = aUp*bDown + bUp*aDown;
        int cDown = aDown*bDown;


        System.out.print(cUp/GCD(cUp, cDown) + " ");
        System.out.print(cDown/GCD(cUp, cDown));
    }

    public static long GCD(long x, long y) {
        if(y == 0) {
            return x;
        }
        else {
            return GCD(y, x % y);
        }
    }
}
