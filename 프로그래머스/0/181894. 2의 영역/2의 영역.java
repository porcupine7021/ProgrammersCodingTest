import java.util.Arrays;

class Solution {
            public static int[] solution(int[] arr) {
                int start = -1;
                int end = -1;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == 2) {
                        if (start == -1) { 
                            start = i;
                        }
                        end = i; 
                    }
                }

                int[] answer = {-1};
                if (start != -1 && end != -1) {
                    answer = Arrays.copyOfRange(arr, start, end + 1);
                }

                return answer;
            }
        }