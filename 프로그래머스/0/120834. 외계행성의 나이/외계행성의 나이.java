class Solution {
    public String solution(int age) {
        
        String digits = "abcdefghij"; 
        String answer = "";

        for (char ch : String.valueOf(age).toCharArray()) {
            answer += digits.charAt(ch - '0');
        }

        return answer;
    }
}
