import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
       List<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (num % divisor == 0) list.add(num);
        }
        
        return list.isEmpty() ? new int[]{-1} 
                              : list.stream().sorted().mapToInt(i -> i).toArray();
   
    }
}