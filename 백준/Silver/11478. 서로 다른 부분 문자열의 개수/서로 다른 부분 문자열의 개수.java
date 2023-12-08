import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        Set<String> strSet = new HashSet<>();
        for(int i = 0; i<st.length(); i++) {
            int j = 1;
            while(i+j<=st.length()){
                strSet.add(st.substring(i, i+j));
                //System.out.println(st.substring(i, i+j));
                j++;
            }
        }
        System.out.println(strSet.size());
    }
}
