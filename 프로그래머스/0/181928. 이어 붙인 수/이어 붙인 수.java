class Solution {
    public int solution(int[] num_list) {
        String holsu = "", jacsu="";
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                holsu += String.valueOf(num_list[i]);
            } else jacsu += String.valueOf(num_list[i]);
        }
        return Integer.parseInt(holsu) + Integer.parseInt(jacsu);
    }
}