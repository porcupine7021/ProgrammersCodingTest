import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        
        Arrays.sort(num_list); 
        
        List<Integer> numArr = new ArrayList<>(); 
        for (int i=5; i<num_list.length; i++) {
            numArr.add(num_list[i]);
        }
        
        int[] answer = new int[numArr.size()];
        
        for (int i=0; i<numArr.size(); i++) {
            answer[i] = numArr.get(i);
        }
        
        return answer;
    }
}