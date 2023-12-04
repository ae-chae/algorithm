import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int i = 1;

        while(n>x) {
            x += (i*6);
            i++;
        }
        System.out.println(i);
    }
}
