import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(n>i) {
            n = n - i;
            i += 1;
        }

        if(i%2 == 1) System.out.print((i-n+1) + "/" + (n));
        else System.out.print(n + "/" + (i-n+1));
    }
}