import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        long evenCounts = Arrays.stream(num_list).filter(n -> n % 2 == 0).count();
        long oddCounts = Arrays.stream(num_list).filter(n -> n %  2 == 1).count();
        answer[0] = (int) evenCounts;
        answer[1] = (int) oddCounts;
        return answer;
    }
}