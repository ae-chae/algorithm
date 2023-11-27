import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int a = 0;
        int b = 0;
        //int[][] arr = new int[9][9];
        for(int i = 0; i< 9; i++){
            for(int j = 0; j < 9; j++) {
                int x = sc.nextInt();
                if(max < x){
                    max = x;
                    //arr[i][j] = x;
                    a = i+1;
                    b = j+1;
                }

            }
        }

        if(max == 0){
            a = 1;
            b = 1;
        }


        System.out.println(max);
        System.out.println(a + " " + b);

    }

}

