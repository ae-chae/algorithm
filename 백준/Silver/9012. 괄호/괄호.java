import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<n; i++) {
            boolean check = true;
            String str = br.readLine();

            for(int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '(')
                    stack.push(str.charAt(j));
                else
                if(stack.isEmpty())
                    check = false;
                else
                    stack.pop();
            }
            if(!stack.isEmpty())
                check = false;
            if(check)
                System.out.println("YES");
            else
                System.out.println("NO");

            stack.clear();
        }


    }
}