class Solution {
    public int solution(int number, int limit, int power) {
        
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            
            int cnt = 0;
            int root = (int)Math.sqrt(i);
            
            for (int d = 1; d <= root; d++) {
                if (i % d == 0) {
                    cnt += 2;
                }
            }
            
            if (root * root == i) cnt--;

            answer += (cnt > limit) ? power : cnt;
        }
        return answer;
    }
}
