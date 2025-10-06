class Solution {
    public int solution(int n, int m, int[] section) {
        
        int answer = 0;
        int start = 1;
        
        for (int i = 0; i < section.length; i++) {
            if (start <= section[i]) {
                answer += 1;
                start = section[i] + m;
            }
        }
        
        return answer;
    }
}