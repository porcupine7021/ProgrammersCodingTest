class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        }

        int sum1 = 0, sum2 = 0;
        for (int n : arr1) sum1 += n;
        for (int n : arr2) sum2 += n;

        return sum1 == sum2 ? 0 : (sum1 > sum2 ? 1 : -1);
    }
}
