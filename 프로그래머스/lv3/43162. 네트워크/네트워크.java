class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        for(int i  = 0; i < n; i++) {
        	if(computers[i][i] == 1) answer++;
        	else continue;
        	computers[i][i] = 0;
        	for(int j = i+1; j <n; j++) {
        		if(computers[i][j] == 1) {
        			computers[j][j] = 0;
        			computers[i][j] = 0;
        			ReNetwork(n, j, i, computers);
        		}
        	}
        }        
        return answer;
    }
    
    public void ReNetwork(int n, int i, int m, int[][] computers) {
    	for(int j = m+1; j < n; j++) {
    		if(i!=j && ( computers[i][j] == 1)) {
    			computers[j][j] = 0;
    			computers[i][j] = 0;
    			ReNetwork(n, j, m, computers);
    		}
    	}
    }
}