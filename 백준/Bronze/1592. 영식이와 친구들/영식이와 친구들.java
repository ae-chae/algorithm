import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();
        int[] arr = new int[n+1];

        for(int i = 1; i < n+1; i++) arr[i] = 0;

        arr[1] = 1;

        int count = 0;
        int index = 1;

        while(true) {
            if(arr[index] == m) break;
            if(arr[index] % 2 == 1) {
                if((index+l)%n == 0) index = n;
                else index = (index+l)%n;
            }else {
                if(index-l < 1) {
                    index = (index - l)+n;
                }else {
                    index = index - l;
                }
            }
            arr[index]++;
            count++;
        }

        System.out.println(count);

    }
}
