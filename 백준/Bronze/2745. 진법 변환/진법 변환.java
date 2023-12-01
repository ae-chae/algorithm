import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();

        char c = ' ';
        long result = 0;

        for(int i = 0; i < n.length(); i++){
            c = n.charAt(n.length()-i-1);
            if(c >= 65) c -= 55;
            else c -= 48;
            result += Math.pow(b, i)*((int)c);
        }
        System.out.println(result);
    }
}
