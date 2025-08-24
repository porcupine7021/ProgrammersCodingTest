import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        
        int n = numbers.length;
        int a = numbers[n-1] * numbers[n-2];
        int b = numbers[0] * numbers[1];
        
        return Math.max(a, b);
    }
}
