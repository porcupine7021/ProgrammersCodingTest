class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] gap = binomial.split(" ");
        int n1 = Integer.parseInt(gap[0]);
        String op = gap[1];
        int n2 = Integer.parseInt(gap[2]);
        
        if (op.equals("+")) {
            answer = n1+n2;
        } else if (op.equals("-")) {
            answer = n1-n2;
        } else if (op.equals("*")) {
            answer = n1*n2;
        }
        
        return answer;
    }
}