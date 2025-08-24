import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        char[] s = String.join("", spell).toCharArray();
        
        Arrays.sort(s);
        
        for (String w : dic) {
            char[] a = w.toCharArray();
            Arrays.sort(a);
            if (Arrays.equals(s, a)) return 1;
        }
        
        return 2;
    }
}
