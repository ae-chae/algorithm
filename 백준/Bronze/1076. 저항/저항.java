import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] resArr = {"black", "brown", "red", "orange", "yellow",
                "green", "blue", "violet", "grey", "white"};
        Scanner sc = new Scanner(System.in);
        String sb = String.valueOf(Arrays.asList(resArr).indexOf(sc.nextLine())) +
                Arrays.asList(resArr).indexOf(sc.nextLine()) +
                "0".repeat(Arrays.asList(resArr).indexOf(sc.nextLine()));
        long isb = Long.parseLong(String.valueOf(sb));
        System.out.println(isb);
    }
}
