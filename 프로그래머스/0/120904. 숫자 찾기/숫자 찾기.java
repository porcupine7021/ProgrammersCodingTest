class Solution {
    public int solution(int num, int k) {
        
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);
        
        int idx = numStr.indexOf(kStr);
        if (idx == -1) {
            return -1;
        }
        
        return idx + 1;
    }
}
