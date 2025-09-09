class Solution {
    public String solution(String X, String Y) {
        
        int[] a = new int[10];
        int[] b = new int[10];

        for (int i = 0; i < X.length(); i++) {
            int num = X.charAt(i) - '0';
            a[num]++;
        }

        for (int i = 0; i < Y.length(); i++) {
            int num = Y.charAt(i) - '0';
            b[num]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int d = 9; d >= 0; d--) {
            int use = Math.min(a[d], b[d]);
            
            while (use-- > 0) sb.append(d);
        }

        if (sb.length() == 0) return "-1";
        if (sb.charAt(0) == '0') return "0";

        return sb.toString();
    }
}
