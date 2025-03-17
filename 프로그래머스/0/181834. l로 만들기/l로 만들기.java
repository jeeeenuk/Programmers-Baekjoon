import java.util.*;

class Solution {
    public String solution(String myString) {
        String answer = "";
        int i = 0;
        while ( i < myString.length()) {
            int target;
            target = myString.charAt(i);
            if (target < 108){
                answer += 'l';
            } else {
                char c = (char) target;
                answer += c;
            }
            i++;
        }
        return answer;
    }
}