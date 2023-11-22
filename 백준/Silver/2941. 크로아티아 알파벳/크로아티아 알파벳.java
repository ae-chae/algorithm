import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] alph = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for (int i = 0; i < alph.length; i++) {
            if (str.contains(alph[i])){
                str = str.replace(alph[i],"*");
            }
        }
        System.out.println(str.length());
    }
}
