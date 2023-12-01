import java.util.*;
public class Main {
    public static void main(String[] args){
        int[][] white = new int[8][8]; // 흰 칸 배열
        int count = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 8; i++){
            String str = sc.nextLine();
            for(int j = 0; j < 8; j+=2){
                if(i % 2 == 0) white[i][j] = 1;
                else {
                    white[i][j+1] = 1;
                }
            }
            for(int j = 0; j < 8; j++){
                if (str.charAt(j) == 'F') {
                    white[i][j]++;
                }
            }
        }

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(white[i][j] == 2) count ++;
            }
        }

        System.out.print(count);

    }
}
