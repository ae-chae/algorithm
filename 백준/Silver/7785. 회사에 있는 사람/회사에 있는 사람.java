import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Set<String> logSet = new TreeSet<>(Collections.reverseOrder());
        String name = "";
        String log = "";


        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            name = st.nextToken();
            log = st.nextToken();

            if(!logSet.contains(name)) {
                if (log.equals("enter")) logSet.add(name);
            } else {
                if (log.equals("leave")) logSet.remove(name);
            }
        }
        // Iterator 사용
        for (String s : logSet) {
            System.out.println(s);
        }


    }
}
