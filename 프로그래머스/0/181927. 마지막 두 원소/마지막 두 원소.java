import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        int num = num_list[num_list.length - 2];
        int endnum = num_list[num_list.length - 1];
        if (endnum > num){
            answer.add(endnum-num);
        } else answer.add(endnum*2);
        return answer;
    }
}