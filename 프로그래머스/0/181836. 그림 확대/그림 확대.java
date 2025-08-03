import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        
        List<String> answer = new ArrayList<>();
        
        for (String row : picture) {
            String enlarged = row
                    .replaceAll(".", "$0".repeat(k)); 
            for (int i = 0; i < k; i++) answer.add(enlarged);
        }
        
        return answer.toArray(new String[0]);
    }
}
