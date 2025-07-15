class Solution {
            public int solution(int[] num_list) {
                int r1 = 1, r2 = 0;

                for (int i : num_list) {
                    r1 *= i;  // 값 자체를 곱합니다
                }
                for (int i : num_list) {
                    r2 += i;  // 값 자체를 더합니다
                }
                r2 = (int) Math.pow(r2, 2);

                int answer = r1 < r2 ? 1 : 0;

                return answer;
            }
        }