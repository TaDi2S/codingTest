class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] chars = s.toCharArray();
        
        int flag = 0;
        
        for(char c : chars) {
        	flag = (c == '(') ? flag + 1 : flag - 1;
        	if(flag < 0) {
        		answer = false;
        		break;
        	}
        }

        if(flag != 0) {
        	answer = false;
        }
        
        return answer;
    }
}