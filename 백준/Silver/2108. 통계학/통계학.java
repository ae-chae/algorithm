import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		Map<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> arrList = new ArrayList<>();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
        	arr[i] = x;
        	sum += x;
        	if (map.containsKey(x)) {
                map.replace(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }
		
		
		Arrays.sort(arr);
		double avg = sum/n;
		
		int temp = 0;
        for (int i : map.values()) {
            temp = Math.max(temp, i);
        }
        
        for (int i : map.keySet()) {
            int temp1 = map.get(i);
            if (temp1 == temp) {
                arrList.add(i);
                continue;
            }
        }
        
        int result = 0;
        
        Collections.sort(arrList);
        if (arrList.size() > 1) {
            result = arrList.get(1);
        } else {
            result = arrList.get(0);
        }
		
        double d_average = (double) sum/n;
        int average =(int) Math.round(d_average);
        System.out.println(average);
        
        if (n == 1) System.out.println(arr[0]);
        else System.out.println(arr[(n/2)]);
		System.out.println(result);
		System.out.println(arr[n-1] - arr[0]);
	}

}
