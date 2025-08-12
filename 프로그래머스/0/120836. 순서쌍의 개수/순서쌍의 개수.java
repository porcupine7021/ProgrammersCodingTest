class Solution {
    public int solution(int n) {
        
        return (int) java.util.stream.IntStream.rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .count();
    }
}
