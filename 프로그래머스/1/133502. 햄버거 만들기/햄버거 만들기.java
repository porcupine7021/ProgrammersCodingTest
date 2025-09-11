class Solution {
    public int solution(int[] ingredient) {
        
        StringBuilder sb = new StringBuilder();
        
        int answer = 0;
        
        for (int x : ingredient) {
            sb.append((char) ('0' + x));
            
            int len = sb.length();
            
            if (len >= 4 &&
                sb.charAt(len - 4) == '1' &&
                sb.charAt(len - 3) == '2' &&
                sb.charAt(len - 2) == '3' &&
                sb.charAt(len - 1) == '1') {
                sb.setLength(len - 4);
                answer++;
            }
        }
        
        return answer;
    }
}
