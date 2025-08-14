class Solution {
    public int solution(int[] numbers, int K) {
        
        int answer = ((K - 1) * 2) % numbers.length;
        
        return numbers[answer];
    }
}
