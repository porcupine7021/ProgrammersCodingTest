class Solution {
    public int[] solution(int[] arr, int n) {
        
        int len = arr.length;
        int[] answer = arr.clone();
        int startIndex = (len % 2 == 1) ? 0 : 1;

        for (int i = startIndex; i < len; i += 2) {
            answer[i] += n;
        }

        return answer;
    }
}
