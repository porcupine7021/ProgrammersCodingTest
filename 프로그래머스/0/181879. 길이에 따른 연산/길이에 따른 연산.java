class Solution {
    public int solution(int[] num_list) {
        
        int answer = 1;
        int sum = 0;
        
        for(int i=0;i<num_list.length;i++){
            if(num_list.length < 11){
                answer *= num_list[i];
            }else {
                sum += num_list[i];
                answer = sum;
            }
        }
        return answer;
    }
}
