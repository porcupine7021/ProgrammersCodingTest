class Solution {
    public int solution(String s) {
        
        int sum = 0, n = 0;
        
        for (char c : s.toCharArray()) {
            
            if (Character.isDigit(c)) n = n * 10 + (c - '0');
            
            else { sum += n; n = 0; }
        }
        
        return sum + n;
    }
}
