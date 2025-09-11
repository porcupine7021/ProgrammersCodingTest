class Solution {
    public int[] solution(long n) {
        
        String str = String.valueOf(n);
        
        char[] chars = str.toCharArray();
        
        int[] answer = new int[chars.length];

        int idx = chars.length - 1;
        
        for (char c : chars) {
            answer[idx--] = c - '0';
        }
        
        return answer;
    }
}
