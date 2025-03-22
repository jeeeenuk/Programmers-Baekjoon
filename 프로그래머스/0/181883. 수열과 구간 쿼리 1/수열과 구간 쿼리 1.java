class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] index = new int[2];
        
        for (int i = 0; i < queries.length; i++){
            for (int j = 0; j < queries[i].length; j++){
                index[j] = queries[i][j];
            }
            for (int k = index[0]; k <= index[1]; k++){
                arr[k] += 1;
            }
        }
        return arr;
    }
}