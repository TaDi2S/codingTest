import java.util.LinkedList;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        int totalSize = (t+1)*m;
        
        LinkedList<Character> charArr = new LinkedList<>();
        int cnt = 0;
        while(true) {        	
        	charArr.addAll(BaseConvert(cnt, n));        	
        	cnt++;
        	
        	if(charArr.size() >= totalSize) break;        	
        }
        
        cnt = 1;
        if (m == p) p = 0;
        for(Character tmp : charArr) {
        	char tmpChar;
        	if((cnt)%m == p) {
        		if(tmp >= 58) tmpChar = (char) (tmp + 7);
        		else tmpChar = tmp;
        		answer += Character.toString(tmpChar);
        	}
        	cnt++;
    		if (answer.length() == t) break;
        	
        }
        
        return answer;
    }
    
    public LinkedList<Character> BaseConvert(int number, int base) {
    	
    	LinkedList<Character> remainArr = new LinkedList<>();
    	
    	while(true) {    		
    		remainArr.addFirst((char)((number % base)+48));
    		number = number / base;
    		if(number == 0) break;     		
    	}
    	
    	return remainArr;
    }
    
}