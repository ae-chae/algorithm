import java.util.*;
public class Main {
    public static int isPrime(int n) {
        if(n == 1) return 0;
        else if(n == 2) return 2;

        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;

        for(int i = a; i <= b; i++){
            if(isPrime(i) != 0) list.add(i);
        }
        for(int item:list){
            sum += item;
        }
        if(list.isEmpty()) System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }

    }
}
