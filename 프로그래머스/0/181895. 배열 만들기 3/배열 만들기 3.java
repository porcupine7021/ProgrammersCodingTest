import java.util.ArrayList;
import java.util.Arrays;

class Solution {
            public int[] solution(int[] arr, int[][] intervals) {
                ArrayList<Integer> list = new ArrayList<>();

                for (int[] interval : intervals) {
                    int start = interval[0];
                    int end = interval[1];
                    for (int j = start; j <= end; j++) {
                        list.add(arr[j]);
                    }
                }

                return list.stream().mapToInt(i -> i).toArray();
            }
        }