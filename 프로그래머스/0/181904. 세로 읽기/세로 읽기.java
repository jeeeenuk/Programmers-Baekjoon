import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> result = new ArrayList<>();
    
        for (int i = 0; i < my_string.length(); i+=m){
            int end = Math.min(i + m, my_string.length());
            result.add(my_string.substring(i, end));
        }
        
        StringBuilder answer = new StringBuilder();
        
        for (String str : result){
            if (c - 1 < str.length()){
                answer.append(str.charAt(c-1));
            }
        }
        return answer.toString();
    }
}