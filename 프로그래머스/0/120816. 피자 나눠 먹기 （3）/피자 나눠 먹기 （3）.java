class Solution {
    public int solution(int slice, int n) {
        int pizza = 0;
        while(true){
            pizza++;
            if ((double)pizza*slice/n >= 1.0){
                break;
            }
        }
        return pizza;
    }
}