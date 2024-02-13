import java.util.*;

public class Solution {
    public static List solution(int[] arr) {
        	
        	List<Integer> arrList = new ArrayList<Integer>();

            arrList.add(arr[0]);

            for(int i = 1; i <arr.length; i++) {
                if(arr[i] != arrList.get(arrList.size()-1)){
                	arrList.add(arr[i]);
                }
            }

            return arrList;
        }
}