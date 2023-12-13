import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> setX = new HashSet<>();
        HashSet<Integer> setY = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(setX.contains(x)) {
                setX.remove(x);
            }else setX.add(x);

            if(setY.contains(y)) {
                setY.remove(y);
            }else setY.add(y);
        }

        Iterator<Integer> iterX = setX.iterator();
        Iterator<Integer> iterY = setY.iterator();


        System.out.print(iterX.next() +" " + iterY.next());

    }
}