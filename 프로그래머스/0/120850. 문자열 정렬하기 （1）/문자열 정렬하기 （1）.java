import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        my_string = my_string.replaceAll("[^0-9]", "");
        
        char[] chars = my_string.toCharArray();
        
        int[] answer = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            answer[i] = chars[i] - '0'; 
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
