import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[26];
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++){
            if (65 <= str.charAt(i) && str.charAt(i) <= 90) { // 대문자 범위
                arr[str.charAt(i) - 65]++;	// 해당 인덱스의 값 1 증가
            }

            else {	// 소문자 범위
                arr[str.charAt(i) - 97]++;
            }
        }

        char c = '?';
        for (int i = 0; i < 26; i++){
            if(arr[i] > maxCount){
                maxCount = arr[i];
                c = (char)(i+65);
            }
            else if (arr[i] == maxCount) {
                c = '?';
            }
        }
        System.out.println(c);
    }
}
