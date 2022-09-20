class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n == 1){
            return 1;
        }
        
        double root = Math.sqrt(n);
        
        for(int i = 1; i <= root; i++){
            if(n%i == 0){
                answer += i;
                if(i!=root){
                    answer += n/i; 
                }
                               
            }
        }        
        
        return answer;
    }
}