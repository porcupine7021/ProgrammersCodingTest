class Solution {
    public int solution(int[] nums) {
        
        int n = nums.length, answer = 0;
        
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    
                    int sum = nums[i] + nums[j] + nums[k];
                    boolean prime = true;
                    
                    for (int d = 2; d * d <= sum; d++) {
                        if (sum % d == 0) { 
                            prime = false; break; 
                        }
                    }
                    if (sum > 1 && prime) answer++;
                }
            }
        }
        return answer;
    }
}
