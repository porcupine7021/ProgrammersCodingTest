class Solution {
    boolean solution(String s) {
        
        return s.toLowerCase().replaceAll("[^p]", "").length()
             == s.toLowerCase().replaceAll("[^y]", "").length();
    }
}