class Solution {
    public int solution(String s) {
        
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') sum += c - '0';
        }
        
        return sum;
    }
}
