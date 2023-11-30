import java.util.*;
public class Main {
    public static long GCD(long x, long y) {
        if(y == 0) {
            return x;
        }
        else {
            return GCD(y, x % y);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        long result = GCD(x, y);
        StringBuilder sb = new StringBuilder();

        for(long i = 0; i < result; i++){
            sb.append("1");
        }
        System.out.println(sb);
    }
}
