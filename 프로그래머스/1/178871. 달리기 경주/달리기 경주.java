import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> rank = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }

        for (String call : callings) {
            int curIdx = rank.get(call);
            int frontIdx = curIdx - 1;

            String frontPlayer = players[frontIdx];
            String curPlayer = players[curIdx];

            players[frontIdx] = curPlayer;
            players[curIdx] = frontPlayer;

            rank.put(curPlayer, frontIdx);
            rank.put(frontPlayer, curIdx);
        }

        return players;
    }
}
