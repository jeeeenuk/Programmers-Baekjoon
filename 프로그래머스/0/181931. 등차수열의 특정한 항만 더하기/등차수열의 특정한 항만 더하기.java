class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = a, num = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                num += answer;
            }
            answer += d;
        }
        return num;
    }
}