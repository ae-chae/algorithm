import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        //ArrayList<Integer> list1 = new ArrayList<>();
        //Set<Integer> set = new HashSet<>();
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        int count = 0;


        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int dis = Integer.parseInt(st.nextToken());
            int speed = Integer.parseInt(st.nextToken());

            for(int j = 0; j<dis; j++){
                arr1[count+j] = speed;
            }
            count += dis;
        }

        count = 0;


        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int dis = Integer.parseInt(st.nextToken());
            int speed = Integer.parseInt(st.nextToken());

            for(int j = 0; j<dis; j++){
                arr2[count+j] = speed;
            }
            count += dis;
        }

        for(int i = 0; i<100; i++) {
            arr1[i] = arr2[i] - arr1[i];
        }

        Arrays.sort(arr1); // 배열 정렬
        if(arr1[arr1.length-1] <= 0){
            System.out.println(0);
        }else {
            System.out.println(arr1[arr1.length - 1]);
        }
    }
}
