class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i<=right; i++) {
        	int num = getMeasureSize(i);
        	
        	if(num % 2 == 0) {
        		answer +=  i;
        	}else {
        		answer -= i;
        	}
        }
        
        return answer;
    }
    
        public int getMeasureSize(int n){
    	int sqrt = (int) Math.sqrt(n); 
        int cnt = 0;

    	for(int i = 1; i <= sqrt; i++){
    	   if(n % i == 0){ 
    	    cnt++;
    	        if(n / i != i){ 
    	            cnt++;
    	        }
    	    }
    	}
    	
    	return cnt;
    }
}