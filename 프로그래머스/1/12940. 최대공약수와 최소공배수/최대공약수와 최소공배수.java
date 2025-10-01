class Solution {
    public int[] solution(int n, int m) {
        
        int answer = 1; 
        
        for (int i = 1; i <= Math.min(n, m); i++) {
            
            if (n % i == 0 && m % i == 0) answer = i;
        }
        return new int[]{answer, n * m / answer};
    }
}
