class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();;
        
        answer = answer.replaceAll("[^a-z0-9\\_\\-\\.]", "");
        answer = answer.replaceAll("\\.{2,}", ".");
        answer = answer.replaceAll("^\\.|\\.$", "");
        
        answer = (answer.length() == 0) ? "a" : answer;
        answer = (answer.length() >= 16) ? answer.substring(0,15) : answer;
        answer = answer.replaceAll("^\\.|\\.$", "");
        
        if(answer.length() <= 2) {
        	char c = answer.charAt(answer.length()-1);
        	for(int i = answer.length(); i < 3; i++) {
        		answer += c;
        	}
        }
        
        
        return answer;
    }
}