class Solution {
    public int[] solution(int[] array) {
        
        int idx = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[idx]) idx = i;
        }
        return new int[]{array[idx], idx};
    }
}
