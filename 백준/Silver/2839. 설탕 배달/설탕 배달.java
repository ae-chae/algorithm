import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 1667; i++){
            for(int j = 0; j < 1001; j++){
                if(3*i+5*j == n){
                    list.add(i+j);
                }
            }
        }
        if(list.isEmpty()){
            System.out.println(-1);
        }else {
            System.out.println(Collections.min(list));
        }
    }
}
