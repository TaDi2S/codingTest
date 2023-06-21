import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> sizeMap = new HashMap<>();
 
        for(int num : tangerine) {
        	int size = 0;        	
        	if(sizeMap.containsKey(num)) size = sizeMap.get(num);        	
        	size++;
        	sizeMap.put(num, size);        	
        }
        
        List<Integer> keySet = new ArrayList<>(sizeMap.keySet());
        
        keySet.sort((o1, o2) -> sizeMap.get(o2).compareTo(sizeMap.get(o1)));
        
        answer = 1;
        
        for(int key : keySet) {
        	int size = sizeMap.get(key);
        	
        	k -= size;
        	if(k<=0) break;
        	answer++;
        }        
        
        return answer;
    }
}