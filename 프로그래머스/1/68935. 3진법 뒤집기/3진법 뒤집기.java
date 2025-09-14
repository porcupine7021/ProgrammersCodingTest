class Solution {
    public int solution(int n) {
        
        String base = Integer.toString(n, 3);
        String reversed = "";
        
        for (int i = base.length() - 1; i >= 0; i--) {
            reversed += base.charAt(i);
        }
        
        int answer = Integer.parseInt(reversed, 3);
        
        return answer;
    }
}
