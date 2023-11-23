import java.lang.*;
class Solution {
    public String solution(int num) {
        String answer = "";
        num = Math.abs(num);
        if (num % 2 == 0) answer = "Even";
        else answer = "Odd";
        return answer;
    }
}