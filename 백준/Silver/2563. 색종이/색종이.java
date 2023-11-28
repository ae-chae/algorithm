import java.util.*;

public class Main {
    public static void main(String[] args){
        int[][] arr = new int[100][100];
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 0;

        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int j = x; j < (x+10); j++){
                for(int k = y; k < (y+10); k++){
                    arr[j][k] = 1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                num+=arr[i][j];
            }
        }

        System.out.println(num);

    }
}
