import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int num:arr) {
            boolean Delete = false;
            for (int del:delete_list){
                if (num == del){
                    Delete = true;
                    break;
                }
            }
            if (!Delete){
                answer.add(num);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}