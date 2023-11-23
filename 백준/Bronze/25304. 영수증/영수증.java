import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = sc.nextInt();
        int cost = 0;
        int num = 0;

        for (int i = 0; i < count; i++){
            cost = sc.nextInt();
            num = sc.nextInt();

            total -= cost * num;
        }

        if (total == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
