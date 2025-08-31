class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        
        int n = schedules.length;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            
            int h = schedules[i] / 100;
            int m = schedules[i] % 100 + 10;
            if (m >= 60) {
                h++;
                m -= 60;
            }
            
            int limit = h * 100 + m;

            boolean ok = true;
            
            for (int d = 0; d < 7; d++) {
                int dow = ((startday - 1 + d) % 7) + 1;
                if (dow == 6 || dow == 7) continue;
                if (timelogs[i][d] > limit) {
                    ok = false;
                    break;
                }
            }
            if (ok) answer++;
        }
        return answer;
    }
}