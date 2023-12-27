import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 1) {
            System.out.print(666);
        } else {
            int num = 667;
            int count = 1;
            while(count != n){
                num++;
                String str = String.valueOf(num);
                if(str.contains("666")) {
                    count++;
                }
            }
            System.out.print(num);
        }


    }
}
