import java.io.*;
import java.util.*;

public class Main {
    public static int min = 64;
    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];
        //char[][] sam = new char[8][8];

        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }


        for(int i = 0; i<n-7; i++){
            for(int j = 0; j<m-7; j++) {
                count(arr, i, j);
            }
        }
        System.out.println(min);

    }

    public static void count(char[][] arr, int x, int y) {
        int count1 = 0;
        int count2 = 0;
       // System.out.println(Arrays.deepToString(arr));

        for(int i = x; i < x+8; i++) {
            for(int j = y; j < y+8; j++) {
                if((i+j)%2 == 0){
                    if(arr[i][j] != 'W') { // 시작 칸 W인 경우
                        count1++;
                    }
                }else {
                    if(arr[i][j] != 'B') {
                        count1++;
                    }
                }
            }
        }
            list.add(count1);

        for(int i = x; i < x+8; i++) {
            for(int j = y; j < y+8; j++) {
                if((i+j)%2 == 0){
                    if(arr[i][j] != 'B') { // 시작 칸 B인 경우
                        count2++;
                    }
                }else {
                    if(arr[i][j] != 'W') {
                        count2++;
                    }
                }
            }
        }

            list.add(count2);

        min = Collections.min(list);
    }
}
