import java.util.*;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : array){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = Collections.max(map.values());
        int countMax = 0;
        int modeCandidate = 0;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxCount) {
                countMax++;
                modeCandidate = entry.getKey();
            }
        }
        return countMax > 1 ? -1 : modeCandidate;
    }
}