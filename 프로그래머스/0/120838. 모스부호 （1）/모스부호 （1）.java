import java.util.Arrays;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] letterArr = letter.split(" ");
        
        for(String str : letterArr){
            for (int i = 0; i < morse.length; i++){
                if (str.equals(morse[i])){
                    sb.append(Character.toString(i + 97));
                }
            }
        }
        
        return sb.toString();
    }
}