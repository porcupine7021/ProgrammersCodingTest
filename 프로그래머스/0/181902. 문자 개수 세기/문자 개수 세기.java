class Solution {
            public int[] solution(String my_string) {
                int[] answer = new int[52];

                String[] alphabet = {
                        "A", "B", "C", "D", "E", "F", "G", "H", "I",
                        "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                        "S", "T", "U", "V", "W", "X", "Y", "Z",
                        "a", "b", "c", "d", "e", "f", "g", "h", "i",
                        "j", "k", "l", "m", "n", "o", "p", "q", "r",
                        "s", "t", "u", "v", "w", "x", "y", "z"};
                
                String[] m = my_string.split("");
                
                for (int i = 0; i < m.length; i++) {
                    for (int j = 0; j < alphabet.length; j++) {
                        if (m[i].equals(alphabet[j])) {
                            answer[j] += 1;
                        }
                    }
                }

                return answer;
            }
        }