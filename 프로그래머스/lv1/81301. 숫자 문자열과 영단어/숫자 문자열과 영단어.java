class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] mapping = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i < mapping.length; i++) {
        	String munja = mapping[i];
        	
        	s = s.replaceAll(munja, String.valueOf(i));
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }
}