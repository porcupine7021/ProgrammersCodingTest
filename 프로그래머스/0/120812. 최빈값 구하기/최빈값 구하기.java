public class Solution {
    public int solution(int[] array) {
        
        int max = 0;
        
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        int[] count = new int[max + 1];

        for (int num : array) {
            count[num]++;
        }

        int mode = 0;
        int maxCount = 0;
        boolean isDuplicate = false;

        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mode = i;
                isDuplicate = false;
            } else if (count[i] == maxCount && count[i] != 0) {
                isDuplicate = true;
            }
        }

        return isDuplicate ? -1 : mode;
    }
}