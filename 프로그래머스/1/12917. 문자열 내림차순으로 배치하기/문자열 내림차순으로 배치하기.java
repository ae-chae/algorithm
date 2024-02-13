import java.util.*;
class Solution {
    	public static String solution(String s) {
        String answer = "";
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr, 0, arr.length));
        answer = sb.reverse().toString();
        
        return answer;
    }
}