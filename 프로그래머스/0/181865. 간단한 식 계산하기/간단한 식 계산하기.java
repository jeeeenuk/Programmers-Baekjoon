class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split(" ");
        int a = Integer.parseInt(parts[0]);
        String op = parts[1];
        int b = Integer.parseInt(parts[2]);
        
        return op.equals("+") ? (a + b) : (op.equals("-") ? (a-b) : (a*b));
    }
}