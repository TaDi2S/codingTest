class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = {};
        answer = new int[(int)(right-left)+1];
        
        for(long i = left; i <= right; i++){
            long nn = (long)n;
            
            long x = i/nn;
            long y = i%nn;
            answer[(int)(i-left)] = (x >= y) ? (int)x+1 : (int)y+1;
            
        }
        
        return answer;
    }
}