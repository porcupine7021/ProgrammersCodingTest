class Solution {
            public int solution(int a, int b) {

                int addAb = Integer.valueOf((String.valueOf(a) + String.valueOf(b)));
                int multiplyAb = 2* a * b;
                int answer = addAb >  multiplyAb ? addAb : multiplyAb;
                return answer;
            }
        }