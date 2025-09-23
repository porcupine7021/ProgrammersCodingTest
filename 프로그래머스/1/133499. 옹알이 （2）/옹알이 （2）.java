class Solution {
    public int solution(String[] babbling) {
        
        String[] syllables = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String word : babbling) {
            int i = 0;
            String prev = "";
            boolean ok = true;

            while (i < word.length()) {
                boolean matched = false;
                for (String s : syllables) {
                    if (!s.equals(prev) && word.startsWith(s, i)) {
                        prev = s;
                        i += s.length();
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    ok = false;
                    break;
                }
            }
            if (ok) answer++;
        }
        return answer;
    }
}
