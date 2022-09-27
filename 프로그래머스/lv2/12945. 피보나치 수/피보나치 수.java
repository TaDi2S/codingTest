class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int sub2 = 0;
        int sub1 = 1;
        
        for(int i = 2; i <= n; i++) {
        	answer = sub2 + sub1;
            answer %= 1234567;
        	sub2 = sub1;
        	sub1 = answer;
        }
        
        return answer;
    }
}