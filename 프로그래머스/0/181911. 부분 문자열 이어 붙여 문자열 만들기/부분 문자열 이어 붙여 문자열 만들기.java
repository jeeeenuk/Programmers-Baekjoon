class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String result = "";
        
        for (int i = 0; i < parts.length; i++) {
            String a = my_strings[i].substring(parts[i][0], parts[i][1] + 1);
            result += a;
        }
        return result;
    }
}