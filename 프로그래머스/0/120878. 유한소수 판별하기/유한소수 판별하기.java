class Solution {
    public int solution(int a, int b) {
        
        int x = a, y = b, t;
        
        while (y != 0) {
            
            t = x % y; x = y; y = t; 
        }
        
        b /= x;
        
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        
        return b == 1 ? 1 : 2;
    }
}
