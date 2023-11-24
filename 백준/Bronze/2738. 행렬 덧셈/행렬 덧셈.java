import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String arrS[]= a.split(" ");
        int x = Integer.parseInt(arrS[0]);
        int y = Integer.parseInt(arrS[1]);

        int[][] arr = new int[x][y];

        for(int i = 0; i<x; i++){
            String s = sc.nextLine();
            String arrSt[]= s.split(" ");
            for(int j = 0; j<y; j++) {
                arr[i][j] += Integer.parseInt(arrSt[j]);
            }
        }

        for(int i = 0; i<x; i++){
            String s = sc.nextLine();
            String arrSt[]= s.split(" ");
            for(int j = 0; j<y; j++) {
                arr[i][j] += Integer.parseInt(arrSt[j]);
            }
        }

        for(int i = 0; i<x; i++){
            for(int j = 0; j<y; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
