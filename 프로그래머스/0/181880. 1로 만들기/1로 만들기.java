class Solution {
    public int solution(int[] num_list) {
        int counts = 0;
        int index = 0;
        while(true){
            if(num_list[index] != 1){
                if (num_list[index] % 2 == 0){
                    num_list[index] = num_list[index] / 2;
                    counts++;
                } else {
                    num_list[index] = (num_list[index] -1) / 2;
                    counts++;
                }
            }
            if(num_list[index] == 1){
                index++;
            }

            if(num_list[num_list.length -1] == 1) {
                return counts;
            }
        }
    }
}