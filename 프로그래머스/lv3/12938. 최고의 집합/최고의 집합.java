import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n]; 
        
        int quotient = s/n;
        int remainder = s%n;
        
        if(quotient == 0) {
        	return new int[] {-1};
        }
        
    
        for(int i = 0; i < n; i++) {
        	if(i >= n-remainder) {
        		answer[i] = quotient+1;
        	}else {
        		answer[i] = quotient;        		
        	}
        }
                
        return answer;    	 	
    }
}