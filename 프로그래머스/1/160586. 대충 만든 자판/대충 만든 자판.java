import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        Map<Character, Integer> minPress = new HashMap<>();

        for (String key : keymap) {
            for (int i = 0; i < key.length(); i++) {
                
                char c = key.charAt(i);
                int press = i + 1;

                if (!minPress.containsKey(c)) {
                    
                    minPress.put(c, press);
                } else {
                    
                    int current = minPress.get(c);
                    
                    if (press < current) {
                        minPress.put(c, press);
                    }
                }
            }
        }

        int[] answer = new int[targets.length];

        for (int t = 0; t < targets.length; t++) {
            
            String target = targets[t];
            int total = 0;

            for (int i = 0; i < target.length(); i++) {
                char c = target.charAt(i);

                if (!minPress.containsKey(c)) {
                    total = -1;
                    break;
                }

                total += minPress.get(c);
            }

            answer[t] = total;
        }

        return answer;
    }
}