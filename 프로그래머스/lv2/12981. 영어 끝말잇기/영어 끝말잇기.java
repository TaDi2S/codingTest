import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0}; 
        
        ArrayList<String> answerArr = new ArrayList<>();

        int cnt = 2;
        int cycle = 1;
        
        answerArr.add(words[0]);
        char lastWord = words[0].charAt(words[0].length()-1);
        
        int length = words.length;
        
        for(int i = 1; i < length; i++) {
        	String word = words[i];
        	if(answerArr.contains(word) || lastWord != word.charAt(0)) {
        		answer[0] = cnt;
        		answer[1] = cycle;
        		break;
        	}else {        		
        		answerArr.add(word);
        		lastWord = word.charAt(word.length()-1);
        		cnt = (cnt < n) ? cnt+1:1;
        		cycle = (cnt == 1) ? cycle+1:cycle;
        	}
        }
        
        return answer;
    }
}