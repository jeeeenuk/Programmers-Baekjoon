class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x",-1);
        int[] lengths = new int [arr.length];
        
        for (int i = 0; i < arr.length; i++){
            lengths[i] = arr[i].length();
        }
        
        return lengths;
    }
}