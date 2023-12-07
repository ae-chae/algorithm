import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        Arrays.sort(arr);
        int sum = arr[0] + arr[1];

        if(arr[2] >= sum) System.out.println((sum*2)-1);
        else System.out.println(arr[0]+arr[1]+arr[2]);
    }
}