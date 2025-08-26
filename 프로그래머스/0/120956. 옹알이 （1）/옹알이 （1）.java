class Solution {
    public int solution(String[] babbling) {
        
        String[] s = {"aya","ye","woo","ma"};
        java.util.HashSet<String> set = new java.util.HashSet<>();

        for (int i = 0; i < 4; i++) set.add(s[i]);

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (i != j) set.add(s[i] + s[j]);

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 4; k++)
                    if (i != j && j != k && i != k) set.add(s[i] + s[j] + s[k]);

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                for (int k = 0; k < 4; k++)
                    for (int l = 0; l < 4; l++)
                        if (i != j && i != k && i != l && j != k && j != l && k != l)
                            set.add(s[i] + s[j] + s[k] + s[l]);

        int answer = 0;
        for (String w : babbling) if (set.contains(w)) answer++;
        
        return answer;
    }
}
