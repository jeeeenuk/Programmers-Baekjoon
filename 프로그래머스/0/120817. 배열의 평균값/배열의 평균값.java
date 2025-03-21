class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        double count = 0;
        for (int num : numbers){
            sum += num;
            count++;
        }
        return sum/count;
    }
}