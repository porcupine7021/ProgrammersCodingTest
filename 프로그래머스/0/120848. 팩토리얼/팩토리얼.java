class Solution {
    public int solution(int n) {
        
        int i = 1, fact = 1;
        
        while (fact * (i + 1) <= n) fact *= ++i;
        
        return i;
    }
}
