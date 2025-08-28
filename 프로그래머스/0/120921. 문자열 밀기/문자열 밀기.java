class Solution {
    public int solution(String A, String B) {
        
        if (A.length() != B.length()) {
            
            return -1;
        }
        

        String rotated = A;
        
        for (int i = 0; i < A.length(); i++) {
            if (rotated.equals(B)) {
                return i;
            }
            rotated = rotated.charAt(rotated.length() - 1) 
                + rotated.substring(0, rotated.length() - 1);
        }

        return -1;
    }
}
