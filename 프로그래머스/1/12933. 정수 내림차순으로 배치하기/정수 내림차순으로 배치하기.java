import java.util.*;

class Solution {
    public long solution(long n) {
        
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        
        String result = "";
        
        for (int i = arr.length - 1; i >= 0; i--) {
            
            result += arr[i];
        }
        
        return Long.parseLong(result);
    }
}