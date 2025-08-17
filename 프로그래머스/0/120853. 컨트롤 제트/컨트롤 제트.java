class Solution {
    public int solution(String s) {
        
        String[] tokens = s.split(" ");
        int sum = 0;
        int last = 0;  
        
        for (String token : tokens) {
            if (token.equals("Z")) {
                sum -= last;  
            } else {
                last = Integer.parseInt(token);
                sum += last;   
            }
        }
        
        return sum;
    }
}
