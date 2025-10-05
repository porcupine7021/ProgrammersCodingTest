class Solution {
    public int solution(int n) {
        
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            int j;
            
            for (j = 2; j * j <= i; j++) {
                if (i % j == 0) break;
            }
            if (j * j > i) answer++;
        }

        return answer;
    }
}