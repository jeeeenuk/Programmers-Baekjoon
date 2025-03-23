import java.util.Arrays;

class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String PROGRAMMER_962 = "abcdefghij";
        String[] ageArr = String.valueOf(age).split("");
        
        for(int i = 0; i < ageArr.length; i++){
            answer.append(PROGRAMMER_962.charAt(Integer.parseInt(ageArr[i])));
        }
        return answer.toString();
    }
}