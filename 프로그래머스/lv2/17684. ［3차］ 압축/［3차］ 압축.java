import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String msg) {
    	int[] answer = {};
    	ArrayList<Integer> answerArray = new ArrayList<>();
    	
    	HashMap<String, Integer> dicMap = new HashMap<>();
    	
    	int dicSize = 26;
    	
    	for(int i = 1; i <= 26; i++) {
    		dicMap.put(Character.toString((char) (i+64)), i);
    	}
    	
    	char[] chArr = msg.toCharArray();
    	
    	int length = chArr.length;
    	
    	for(int i = 0; i < length; ++i) {
    		String orgStr = Character.toString(chArr[i]);
    		int lastCheck = 0;
    		
			if(dicMap.containsKey(orgStr)){
				lastCheck = dicMap.get(orgStr);
			}    		
    		int j = i;
    		
    		while(true) {
    			j++;    			
    			if(j >= length) {
    				answerArray.add(lastCheck);
    				i = length;
    				break;
    			}    			
				orgStr += Character.toString(chArr[j]);    			
				if(dicMap.containsKey(orgStr)){
					lastCheck = dicMap.get(orgStr);
				}else {
					dicSize++;
					dicMap.put(orgStr, dicSize);
					i = j-1;
					answerArray.add(lastCheck);
					break;
				}
    		}
    	}
     	int answerSize = answerArray.size();
     	answer = new int[answerSize];
     	for(int i = 0; i < answerSize; i++) {
     		answer[i] = answerArray.get(i);
     		System.out.println(answer[i]);
     	}
    	
    	return answer;
    }
}