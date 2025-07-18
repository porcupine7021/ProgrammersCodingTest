
        class Solution {
            public String solution(String my_string, int[][] queries) {
                StringBuilder answer = new StringBuilder(my_string);

                for(int i = 0; i < queries.length; i++){
                    int s = queries[i][0];
                    int e = queries[i][1];

                    String reversedPart = new StringBuilder(answer.substring(s, e+1)).reverse().toString();
                    answer.replace(s, e+1, reversedPart);

                }
                return answer.toString();
            }
        }