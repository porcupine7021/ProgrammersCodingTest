import java.util.*;

class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        Map<String, int[]> dir = new HashMap<>();
        
        dir.put("up",    new int[]{0, 1});
        dir.put("down",  new int[]{0, -1});
        dir.put("left",  new int[]{-1, 0});
        dir.put("right", new int[]{1, 0});

        int x = 0, y = 0;
        int maxX = board[0] / 2, maxY = board[1] / 2;

        for (String key : keyinput) {
            int[] move = dir.get(key.toLowerCase());
            int nx = x + move[0], ny = y + move[1];
            if (Math.abs(nx) <= maxX && Math.abs(ny) <= maxY) {
                x = nx;
                y = ny;
            }
        }
        
        return new int[]{x, y};
    }
}
