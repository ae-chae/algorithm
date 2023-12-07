import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if(x+y+z != 180) System.out.println("Error");
        else {
            if (x == y  && y == z) System.out.println("Equilateral");
            else if (x != y && y != z && x != z)  System.out.println("Scalene");
            else System.out.println("Isosceles");
        }
    }
}
