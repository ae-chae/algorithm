import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[31];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i< 28; i++){
            int num = sc.nextInt();
            arr[num] = 1;
        }

        for(int i = 1; i< arr.length; i++){
            if(arr[i] != 1) System.out.println(i);
        }

    }
}
