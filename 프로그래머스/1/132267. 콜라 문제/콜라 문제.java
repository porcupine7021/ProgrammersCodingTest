class Solution {
    public int solution(int a, int b, int n) {
        
        int answer = 0;
        
        while (n >= a) {
            
            int bottle = n % a;
            n = (n / a) * b;
            answer += n;
            n += bottle;
        }
        
        return answer;
    }
}
