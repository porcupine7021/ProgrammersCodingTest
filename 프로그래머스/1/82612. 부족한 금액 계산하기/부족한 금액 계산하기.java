class Solution {
    public long solution(int price, int money, int count) {
        
        long answer = (long) price * count * (count + 1) / 2;
        
        return answer > money ? answer - money : 0;
    }
}
