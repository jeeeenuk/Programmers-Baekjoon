class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        answer = (a == b && b == c) ? (a + b + c) * ((int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2))) * (((int)(Math.pow(a,3))) + ((int)(Math.pow(b,3))) + ((int)(Math.pow(c,3)))) :
                (a != b && a !=c && b != c) ? (a + b + c) : (a + b + c) * ((int)(Math.pow(a,2)) + (int)(Math.pow(b,2)) + (int)(Math.pow(c,2)));
        return answer;
    }
}