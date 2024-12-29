import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        switch (n){
            case 1:
                return Arrays.copyOfRange(num_list, 0, slicer[1]+1); 
            case 2:
                return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list, slicer[0], slicer[1]+1);
            case 4:
                for(int i = slicer[0]; i <= slicer[1]; i+= slicer[2]){
                    answer.add(num_list[i]);
                }
                return answer.stream().mapToInt(i -> i).toArray();
            default:
                return new int[0];
        }
    }
}