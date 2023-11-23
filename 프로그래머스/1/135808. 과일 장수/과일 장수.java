import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] scoreInt = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(scoreInt, Collections.reverseOrder());
        for(int i = 0; i < scoreInt.length; i++){
            if((i+1) % m == 0) answer += scoreInt[i] * m;
        }

        return answer;
    }
}