import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        Integer[] arr = new Integer[numlist.length];
        for (int i = 0; i < numlist.length; i++) arr[i] = numlist[i];

        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int da = Math.abs(a - n);
                int db = Math.abs(b - n);
                if (da == db) return b - a;
                return da - db;
            }
        });

        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) result[i] = arr[i];
        
        return result;
    }
}
