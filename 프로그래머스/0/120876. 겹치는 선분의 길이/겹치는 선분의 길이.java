class Solution {
    public int solution(int[][] lines) {
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        for (int[] line : lines) {
            min = Math.min(min, Math.min(line[0], line[1]));
            max = Math.max(max, Math.max(line[0], line[1]));
        }

        int[] cnt = new int[max - min]; 
        
        for (int[] line : lines) {
            int s = Math.min(line[0], line[1]);
            int e = Math.max(line[0], line[1]);
            for (int i = s; i < e; i++) {
                cnt[i - min]++;
            }
        }

        int answer = 0;
        for (int c : cnt) if (c >= 2) answer++;
        return answer;
    }
}
