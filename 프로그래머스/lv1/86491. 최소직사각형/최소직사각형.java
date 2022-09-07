class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int size = sizes.length;
        
        int max_x = 0;
        int max_y = 0;
        
        for(int i = 0; i < size; i++) {
        	int x = sizes[i][0];
        	int y = sizes[i][1];
        	
        	if(x < y) {
        		int z = y;
        		y = x;
        		x = z;        		
        	}
        	
        	if(max_x < x) {
        		max_x = x;
        	}
        	
        	if(max_y < y) {
        		max_y = y;
        	}        	
        }
        
        answer = max_x * max_y;        
        
        return answer;
    }
}