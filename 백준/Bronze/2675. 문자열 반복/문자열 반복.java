import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int re = 0;
        String str = "";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            re = sc.nextInt();
            str = sc.next();
            result.setLength(0);

        for (int k = 0; k < str.length(); k++) {
            for(int j = 0; j < re; j++) {
                result.append(str.charAt(k));
            }
        }

        System.out.println(result);
    }
    }
}
