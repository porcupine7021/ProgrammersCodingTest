class Solution {
    public int solution(String[] strArr) {
        
        int answer = 0;
        int[] arr1 = new int[30];
        
        for (int i = 0; i < strArr.length; i++) {
            arr1[strArr[i].length() - 1]++;
        }
        
        for (int i : arr1) {
            if (answer < i) {
                answer = i;
            }
        }
        
        return answer;
    }
}