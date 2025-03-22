import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int[] newArr = new int[arr.length];
        int counts = 0;
        
        while(true){
            newArr = arr.clone();
            for(int i = 0; i < arr.length; i++){
                if (arr[i] >= 50 && arr[i] % 2 == 0){
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            counts++;
            if (Arrays.equals(newArr, arr)){
                return counts - 1;
            }
        }
    }
}