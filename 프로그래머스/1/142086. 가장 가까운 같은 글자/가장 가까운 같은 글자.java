import java.util.*;

public class Solution {
    public static int[] solution(String s) {
        
        int n = s.length();
        int[] result = new int[n];
        
        Map<Character, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < n; i++) {
            
            char ch = s.charAt(i);
            
            if (lastIndex.containsKey(ch)) {
                result[i] = i - lastIndex.get(ch);
            } else {
                result[i] = -1;
            }
            lastIndex.put(ch, i);
        }

        return result;
    }

}
