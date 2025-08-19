class Solution {
    public int solution(String my_string) {
        
        String[] t = my_string.split(" ");
        
        for (int i = 1; i < t.length; i += 2)
            t[0] = String.valueOf(Integer.parseInt(t[0]) 
                   + (t[i].equals("+") ? 1 : -1) * Integer.parseInt(t[i + 1]));
        
        return Integer.parseInt(t[0]);
    }
}
