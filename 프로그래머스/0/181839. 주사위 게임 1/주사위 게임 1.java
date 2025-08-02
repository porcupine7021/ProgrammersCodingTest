class Solution {
    public int solution(int a, int b) {
        
        boolean add = a % 2 == 1;
        boolean bdd = b % 2 == 1;
        
        if (add && bdd) { 
            return a * a + b * b;
        } else if (add || bdd) { 
            return 2 * (a + b);
        } else { 
            return Math.abs(a - b);
        }
    }
}