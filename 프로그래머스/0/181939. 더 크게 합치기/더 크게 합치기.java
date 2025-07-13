class Solution {
            public int solution(int a, int b) {

                int answer1 = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
                int answer2 = Integer.parseInt(String.valueOf(b)+String.valueOf(a));

                int answer = answer1 > answer2 ? answer1 : answer2;

                return answer;
            }
        }