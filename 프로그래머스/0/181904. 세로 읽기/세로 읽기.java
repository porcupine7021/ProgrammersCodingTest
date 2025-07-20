import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        List<String> arr = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i += m) {
            
            String sub = my_string.substring(i, i + m);
            arr.add(sub);
        }
        
        String answer ="";
        
        for (String str : arr) {
            answer += str.substring(c-1, c);
        }
        
        return answer;
        
           
    }
}