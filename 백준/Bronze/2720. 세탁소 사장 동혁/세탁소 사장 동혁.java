import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] arr = {25, 10, 5, 1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            for(int item : arr){
                System.out.print(num/item+" ");
                num = num%item;
            }
            System.out.println();
        }
    }
}
