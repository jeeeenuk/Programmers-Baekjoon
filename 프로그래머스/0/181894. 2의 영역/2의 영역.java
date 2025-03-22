import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int max = -1;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }
        if (max == -1) {
            return new int[]{-1};
        }
        return Arrays.copyOfRange(arr, min, max+1);
    }
}