class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        int count = 0;
        int zero = 0;
        for(int i: lottos){
            for(int j: win_nums){
                if(i == j){
                    count++;
                }
            }
            if(i == 0) zero++;
        }
        //count = 0, zero = 0
        count = 7 - count;
        if(count - zero >= 6) answer[0] = 6;
        else answer[0] = count - zero;
        
        if(count >= 6) count = 6;
        answer[1] = count;


        return answer;
    }
}