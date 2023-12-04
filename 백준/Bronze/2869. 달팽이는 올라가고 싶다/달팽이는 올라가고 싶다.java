import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int v = s.nextInt();

        int tmp1 = v - a;
        int tmp2 = a - b;

        int day;

        day = (tmp1) / (tmp2) + 1;

        if ((tmp1) % (tmp2) != 0) day++;

        System.out.println(day);
    }
}