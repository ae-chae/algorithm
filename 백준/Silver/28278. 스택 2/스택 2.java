import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        
        
        for(int i = 0; i < n; i++) {
        	StringTokenizer str = new StringTokenizer(br.readLine());
        	char c = str.nextToken().charAt(0);
        	switch (c){
            case '1':
                int x = Integer.parseInt(str.nextToken());
                stack.push(x);
                break;
            case '2':
                if(!stack.isEmpty()){
                    bw.write(stack.pop()+"\n");
                }else{
                    bw.write(-1+"\n");
                }
                break;
            case '3':
                bw.write(stack.size()+"\n");
                break;
            case '4':
                if(stack.isEmpty()){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
                break;
            case '5':
                if(!stack.isEmpty()){
                    bw.write(stack.peek()+"\n");
                }else{
                    bw.write(-1+"\n");
                }
                break;
            default:
                break;
        }
        }
        bw.flush();
        bw.close();
        br.close();
	}

}
