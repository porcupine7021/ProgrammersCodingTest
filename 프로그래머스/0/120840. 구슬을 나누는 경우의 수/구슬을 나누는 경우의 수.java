import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        
        if (share < 0 || share > balls) return 0;
        
        int k = Math.min(share, balls - share); 
        
        BigInteger res = BigInteger.ONE;
        
        for (int i = 1; i <= k; i++) {
            res = res.multiply(BigInteger.valueOf(balls - k + i))
                     .divide(BigInteger.valueOf(i));
        }
        
        return res.intValue(); 
    }
}
