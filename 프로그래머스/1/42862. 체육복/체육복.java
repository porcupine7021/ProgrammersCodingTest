class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int[] c = new int[n + 2];
        int answer = 0;
        
        for (int i = 1; i <= n; i++) c[i] = 1;
        for (int x : lost) c[x]--;
        for (int x : reserve) c[x]++;
        
        for (int i = 1; i <= n; i++) {
            if (c[i] == 0) {
                if (c[i - 1] == 2) { c[i - 1]--; c[i]++; }
                else if (c[i + 1] == 2) { c[i + 1]--; c[i]++; }
            }
            if (c[i] > 0) answer++;
        }
        
        return answer;
    }
}
