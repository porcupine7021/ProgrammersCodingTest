class Solution {
            public String solution(String my_string, int[] index_list) {
                StringBuilder arr = new StringBuilder();
                for (int j : index_list) {
                    arr.append(my_string.charAt(j));
                }

                return arr.toString();
            }
        }