class Solution {
    public int solution(int n) {
        int counts = 0;
        while(true){
            counts++;
            if (counts * 6 % n == 0){
                break;
            }
        }
        return counts;
    }
}