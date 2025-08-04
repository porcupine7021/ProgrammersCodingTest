class Solution {
    public int[][] solution(int n) {
        
        int[][] answer = new int[n][n];
        int value = 1;
        int row = 0, col = 0;
        
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int d = 0;
        
        while (value <= n * n) {
            answer[row][col] = value++;
            int nr = row + dir[d][0];
            int nc = col + dir[d][1];
            
            if (nr < 0 || nr >= n || nc < 0 || nc >= n || answer[nr][nc] != 0) {
                d = (d + 1) % 4; 
                nr = row + dir[d][0];
                nc = col + dir[d][1];
            }
            
            row = nr;
            col = nc;
        }
        
        return answer;
    }
}
