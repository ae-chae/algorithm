import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> runMap = new HashMap<>();

        for(String x: participant){
            if(!runMap.containsKey(x)) {
                runMap.put(x, 1);
            } else {
                runMap.put(x, runMap.get(x) + 1);
            }
        }
        for(String x: completion){
            runMap.put(x, runMap.get(x) - 1);
        }

        for(String key: runMap.keySet()) {
            if (runMap.get(key) != 0){
                answer = key;
            }
        }


        return answer;
    }
}