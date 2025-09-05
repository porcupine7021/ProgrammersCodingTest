class Solution {
    public int solution(String s) {
        
        int answer = 0;
        int sameCount = 0;
        int diffCount = 0;
        
        char x = s.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == x) {
                sameCount++;
            } else {
                diffCount++;
            }

            if (sameCount == diffCount) {
                answer++;
                sameCount = 0;
                diffCount = 0;
                if (i + 1 < s.length()) {
                    x = s.charAt(i + 1);
                }
            }
        }

        if (sameCount != 0 || diffCount != 0) {
            answer++;
        }

        return answer;
    }
}
