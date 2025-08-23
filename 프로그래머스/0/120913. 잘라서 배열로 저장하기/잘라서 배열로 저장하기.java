import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        
        int length = my_str.length() / n;
        
        if (my_str.length() % n != 0) {
            length++;
        }
        
        String[] result = new String[length];
        
        for (int i = 0; i < length; i++) {
            int start = i * n;
            int end = start + n;
            if (end > my_str.length()) {
                end = my_str.length();
            }
            result[i] = my_str.substring(start, end);
        }
        
        return result;
    }
}
