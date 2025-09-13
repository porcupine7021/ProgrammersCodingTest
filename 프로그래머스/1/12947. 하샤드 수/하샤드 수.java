class Solution {
    public boolean solution(int x) {
        
        return x % (String.valueOf(x)
                       .chars()
                       .map(c -> c - '0')
                       .sum()) == 0;
    }
}
