class Solution {
    public String solution(String s, String skip, int index) {
        
       String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            int count = 0;

            while (count < index) {
                cur++;
                if (cur > 'z') cur = 'a';

                if (skip.indexOf(cur) == -1) { 
                    count++;
                }
            }
            answer += cur;
        }

        return answer;
    }
}