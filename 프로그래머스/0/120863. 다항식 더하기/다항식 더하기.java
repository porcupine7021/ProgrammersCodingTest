class Solution {
    public String solution(String polynomial) {
        
        int x = 0, c = 0;
        
        for (String s : polynomial.split(" \\+ ")) {
            if (s.endsWith("x")) x += s.length() ==
                1 ? 1 : Integer.parseInt(s.substring(0, s.length() - 1));
            else c += Integer.parseInt(s);
        }
        
        return x == 0 ? String.valueOf(c)
             : c == 0 ? (x == 1 ? "x" : x + "x")
             : (x == 1 ? "x" : x + "x") + " + " + c;
    }
}
