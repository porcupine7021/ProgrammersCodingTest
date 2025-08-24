class Solution {
    public int solution(int[][] board) {
        
        int n = board.length, m = board[0].length;
        boolean[][] danger = new boolean[n][m];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (board[r][c] == 1) {
                    for (int nr = Math.max(0, r - 1); 
                         nr <= Math.min(n - 1, r + 1); nr++) {
                        for (int nc = Math.max(0, c - 1); 
                             nc <= Math.min(m - 1, c + 1); nc++) {
                            danger[nr][nc] = true;
                        }
                    }
                }
            }
        }

        int safe = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (board[r][c] == 0 && !danger[r][c]) safe++;
            }
        }
        
        return safe;
    }
}
