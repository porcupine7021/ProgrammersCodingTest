class Solution {
    public int[] solution(int[] num_list) {
        
        for (int i = 0; i < num_list.length - 1; i++) {
            for (int j = 0; j < num_list.length - 1 - i; j++) {
                if (num_list[j] > num_list[j + 1]) {
                    int temp = num_list[j];
                    num_list[j] = num_list[j + 1];
                    num_list[j + 1] = temp;
                }
            }
        }

        int size = Math.min(5, num_list.length);
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}
