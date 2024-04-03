class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        boolean mode = true;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (mode == true) {
                if (c != '1' && i % 2 == 0) {
                    answer.append(c);
                } else if (c == '1'){
                    mode = false;
                }
            } else {
                if (c != '1' && i % 2 == 1) {
                    answer.append(c);
                } else if (c == '1'){
                    mode = true;
                }
            }
        }
        if (answer.length()==0) return "EMPTY";
        return answer.toString();
    }
}