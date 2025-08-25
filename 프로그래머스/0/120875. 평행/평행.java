class Solution {
    public int solution(int[][] dots) {
        
        long x0 = dots[0][0], y0 = dots[0][1];
        long x1 = dots[1][0], y1 = dots[1][1];
        long x2 = dots[2][0], y2 = dots[2][1];
        long x3 = dots[3][0], y3 = dots[3][1];

        boolean p01_23 = (y1 - y0) * (x3 - x2) == (y3 - y2) * (x1 - x0);
        boolean p02_13 = (y2 - y0) * (x3 - x1) == (y3 - y1) * (x2 - x0);
        boolean p03_12 = (y3 - y0) * (x2 - x1) == (y2 - y1) * (x3 - x0);

        return (p01_23 || p02_13 || p03_12) ? 1 : 0;
    }
}
