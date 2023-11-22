import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = nums.length/2;
        
        nums = Arrays.stream(nums).distinct().toArray();
        int count1 = nums.length;

        if(count1 < count){
            answer = count1;
        }else {
            answer = count;
        }

        return answer;
    }
}