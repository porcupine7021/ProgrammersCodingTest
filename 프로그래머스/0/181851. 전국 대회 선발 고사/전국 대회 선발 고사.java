import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        int answer = 0;
        int[] a={0,0,0};
        int b=0;
        int c=0;
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        for(int i=0;i<rank.length;i++){
            if(attendance[i]==true){
                temp.add(rank[i]);
            }
        }
        
        int[] temp2 = new int[temp.size()];
        
        for(int i=0;i<temp.size();i++){
            temp2[i]=temp.get(i);
        }
        
        Arrays.sort(temp2);
        
        for(int i=0;i<rank.length;i++){
            for(int j=0;j<3;j++){
                if(temp2[j]==rank[i]){
                    a[j]=i;
                }
            }
        }
        
        answer = a[0]*10000+a[1]*100+a[2];
        
        return answer;
    }
}