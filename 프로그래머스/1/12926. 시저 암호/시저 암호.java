class Solution {
    public String solution(String s, int n) {
        
        String answer = "";
        n = ((n % 26) + 26) % 26;
        
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                
                answer += (char) ('a' + (c - 'a' + n) % 26);
            } else if (Character.isUpperCase(c)) {
                
                answer += (char) ('A' + (c - 'A' + n) % 26);
            } else {
                
                answer += c;
            }
        }
        
        return answer;
    }
}
