import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<n-2;i++){
            for(int j = i+1; j<n-1; j++){
                for(int k= j+1; k<n; k++){
                    sum = arr[i] + arr[j] + arr[k];

                    if(sum <= m) {
                        list.add(sum);
                    }
                }
            }
        }
        System.out.println(Collections.max(list));
    }
}
