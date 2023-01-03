class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int zeroCnt = 0;
        
        String str = s;
        
        while(!str.equals("1")) {
        	cnt++;
        	char[] charArr = str.toCharArray();
        	str = "";
        	for(char c : charArr) {
        		if(c == '0') {
        			zeroCnt++;
        			continue;
        		}else {
        			str += c;
        		}
        	}
        	
        	str = Integer.toBinaryString(str.length());
        }
        
        int[] answer = {cnt, zeroCnt};
        
        return answer;
    }
}