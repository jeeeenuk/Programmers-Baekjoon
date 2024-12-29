class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++){
            boolean remove = false;
            for (int index : indices) {
                if (i == index){
                    remove = true;
                    break;
                }
            }
            if (!remove){
                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}