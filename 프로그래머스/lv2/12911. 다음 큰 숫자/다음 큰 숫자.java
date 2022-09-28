class Solution {
    public int solution(int n) {
        int answer = n;
        
        int nCnt = oneCnt(n);
        
        while(true) {
        	answer++;
        	if(nCnt == oneCnt(answer)) {
        		break;
        	}
        }
        
        return answer;
    }
    
        public int oneCnt(int n){
    	int cnt = 0;
    	int mask = 1;
    	
    	while(mask != 0) {
    		cnt = ((mask & n) != 0) ? cnt+1 : cnt;
    		
    		mask = mask << 1;
    		
    		
    	} 
    	
    	return cnt;
    }
}