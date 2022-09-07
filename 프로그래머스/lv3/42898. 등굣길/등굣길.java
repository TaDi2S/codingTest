class Solution {
    public int solution(int m, int n, int[][] puddles) {
		int answer = 0;
		
		int[][] arr = new int[n][m];
		
		for(short k = 0; k < puddles.length; k++) {			
			arr[puddles[k][1] - 1][puddles[k][0] - 1] = -1;
		}
        
        if(arr[0][1] == -1 && arr[1][0] == -1){
            return 0;
        }else if(arr[n-2][m-1] == -1 && arr[n-1][m-2] == -1){
            return 0;
        }        
        boolean aa = false;
		for(short i = 0; i < n; i++) {
			if(arr[i][0] == -1) {
				arr[i][0] = 0;
				aa = true;
			}
            if(aa){
                arr[i][0] = 0;
            }else{
                arr[i][0] = 1;
            }
            
			
		}
        
        aa = false;
        
		for(short i = 0; i < m; i++) {
			if(arr[0][i] == -1) {
				arr[0][i] = 0;
				aa = true;
			}
			if(aa){
                arr[0][i] = 0;
            }else{
                arr[0][i] = 1;
            }
		}
		
		for(short i = 1; i < n; i++) {
			for(short j = 1; j < m; j++) {
				if(arr[i][j] == -1) {
					arr[i][j] = 0;
				}else {									
					arr[i][j] = (arr[i-1][j] + arr[i][j-1]) % 1000000007;
				}
			}
		}
        
		answer = arr[n-1][m-1];
		
        answer = answer%1000000007;
        
		return answer;
    }
}