import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        int f = sc.nextInt();

        int a = (int) (n%100);

        for(int i = 0; i<100; i++) {
            if((n-a+i)%f == 0) {
                a = i;
                break;
            }
        }
        if(a<10) {
            System.out.print(0);
            System.out.print(a);
        } else System.out.println(a);

    }
}
