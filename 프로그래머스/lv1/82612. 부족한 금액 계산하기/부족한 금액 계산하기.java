class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total_price = 0;
        for(int i = 1; i <= count; i++){
            total_price = total_price + (price * i);
        }
        
        answer = total_price - money;
        if(answer < 0) answer = 0;
        
        return answer;
    }
}