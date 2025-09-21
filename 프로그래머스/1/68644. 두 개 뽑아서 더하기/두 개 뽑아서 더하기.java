import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
       List<Integer> list = new ArrayList<>();
        
       for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                list.add(numbers[i] + numbers[j]);
            }
        }

        int[] temp = new int[list.size()];
        int k = 0;
        
        for (int v : list) {
            temp[k++] = v;
        }

        Arrays.sort(temp);

        List<Integer> unique = new ArrayList<>();
        unique.add(temp[0]);
        
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] != temp[i - 1]) {
                unique.add(temp[i]);
            }
        }

        int[] answer = new int[unique.size()];
        int idx = 0;
        
        for (int v : unique) {
            answer[idx++] = v;
        }

        return answer;
    }
}