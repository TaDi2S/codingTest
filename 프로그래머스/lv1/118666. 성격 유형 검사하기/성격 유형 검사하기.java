class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int size = survey.length;
        
        int R = 0;
        int T = 0;
        int C = 0;
        int F = 0;
        int J = 0;
        int M = 0;
        int A = 0;
        int N = 0;
        
        for(int i = 0; i < size; i++) {
    		if(choices[i] < 4) {
    			int point = (4-choices[i]);    			
    			switch (survey[i].charAt(0)) {
    			case 'R':
    				R += point;
    				break;
    			case 'T':
    				T += point;
    				break;
    			case 'C':
    				C += point;
    				break;
    			case 'F':
    				F += point;
    				break;
    			case 'J':
    				J += point;
    				break;
    			case 'M':
    				M += point;
    				break;
    			case 'A':
    				A += point;
    				break;
    			case 'N':
    				N += point;
    				break;
    			}
    		}else if(choices[i] > 4){
    			int point = (choices[i] - 4); 
    			switch (survey[i].charAt(1)) {
    			case 'R':
    				R += point;
    				break;
    			case 'T':
    				T += point;
    				break;
    			case 'C':
    				C += point;
    				break;
    			case 'F':
    				F += point;
    				break;
    			case 'J':
    				J += point;
    				break;
    			case 'M':
    				M += point;
    				break;
    			case 'A':
    				A += point;
    				break;
    			case 'N':
    				N += point;
    				break;
    			}
    		}
        }
        
        if(R >= T) {
        	answer += "R";
        }else {
        	answer += "T";
        }
        if(C >= F) {
        	answer += "C";
        }else {
        	answer += "F";
        }
		if(J >= M) {
			answer += "J";
		}else {
			answer += "M";
		}
		if(A >= N) {
			answer += "A";
		}else {
			answer += "N";
		}
        
        return answer;
    }
}