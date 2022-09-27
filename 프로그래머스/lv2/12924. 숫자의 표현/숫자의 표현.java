class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++) {
        	if(sumStream(i, n)) {
        		answer++;
        	}
        }
        return answer;
    }
    
    public boolean sumStream(int start, int base) {
    	boolean result = false;
    	int sum = 0;
    	
    	for(int i = start; i <= base; i++) {
    		sum += i;
    		if(sum > base) {
    			break;
    		}else if(sum == base) {
    			result = true;
    			break;
    		}
    	}
    	return result;
    }
}