import java.util.ArrayList;
 
class Solution {
            public int[] solution(int[] arr) {
                ArrayList<Integer> stk = new ArrayList<>();

                int i = 0;

                while (i < arr.length) {
                    if (stk.size() == 0) {
                        stk.add(arr[i]);
                        i++;
                    } else {
                        int last = stk.get(stk.size() - 1);
                        if (last < arr[i]) {
                            stk.add(arr[i]);
                            i++;
                        }  else {
                            stk.remove(stk.size() - 1);
                        }
                    }
                }

                return stk.stream().mapToInt(j -> j).toArray();
            }
        }