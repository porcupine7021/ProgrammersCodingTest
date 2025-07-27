import java.util.ArrayList;
 
class Solution {
    public ArrayList solution(String myString) {
        
        String[] s = myString.split("x",-1);
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<s.length; i++){
            answer.add(s[i].length()) ;    
        }       
        return answer;
    }
}