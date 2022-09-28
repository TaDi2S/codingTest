class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int size = yellow/2+1;
        for(int i = 1; i <= size; i++) {
        	if(yellow%i == 0) {
        		int j = yellow / i;        		
        		if((j*2 + i*2) + 4 == brown) {
        			return new int[] {j+2, i+2};
        		}        		
        	}
        }        
        return answer;
    }
}