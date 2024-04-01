class Solution {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        if (Integer.parseInt(""+a+b) > answer) return Integer.parseInt(""+a+b);
        else return answer;
    }
}