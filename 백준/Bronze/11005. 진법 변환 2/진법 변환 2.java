import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        while(n >= b){
            list.add((n%b));
            n = n/b;
        }
        list.add((n));

        for(int i = list.size(); i > 0; i--){
            char ch = ' ';
            if(list.get(i-1) >= 10){
                ch = (char)(list.get(i-1)+55);
                result.append(ch);
            }else result.append(list.get(i-1));
        }
        System.out.println(result);
    }
}
