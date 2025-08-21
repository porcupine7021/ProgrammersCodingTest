import java.util.*;

class Solution {
    public String solution(String my_string) {
        
        String lower = my_string.toLowerCase();
        String onlyAlpha = lower.replaceAll("[^a-z]", "");
        char[] arr = onlyAlpha.toCharArray();
        
        Arrays.sort(arr);
        
        return new String(arr);
    }
}
