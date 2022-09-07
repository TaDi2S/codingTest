class Solution {
    public int solution(String s) {
        int answer = 0;
        int answer2 = 0;        
        answer = s.length();
        answer2 = answer;
        int size = answer/2;        
        for(int i = 1; i <= size; i++) {
        	int answertmp = answer2;  	
        	int num = 0;      
        	int cnt = 0;
        	String a = s.substring(num, num+i);
        	boolean last = false;
        	num = num + i;
        	while(true) {
        		if(num+i > answer2) break;
        		String b = s.substring(num, num+i);
        		num = num + i;
            	if(a.equals(b)) {
            		if(!last) {
            			answertmp = answertmp - (i-1);
            			last = true;
            		}else {
            			answertmp = answertmp - i;            			
            		}
                    cnt++;
            		if(cnt == 9 || cnt == 99 || cnt == 999) {
            			answertmp += 1;
            		}
            	}else {
            		last = false;
            		cnt = 0;
            	}
            	a = b;
        	}        	
        	if(answertmp < answer) answer = answertmp;
        }
        return answer;
    }
}