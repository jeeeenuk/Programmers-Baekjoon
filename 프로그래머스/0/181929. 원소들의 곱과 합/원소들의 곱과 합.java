class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int gob=1, jegob=0;
        for (int i = 0; i < num_list.length; i++) {
            gob *= num_list[i];
            jegob += num_list[i];
            if (gob > jegob*jegob) answer = 0;
            else answer = 1;
        }
        return answer;
    }
}