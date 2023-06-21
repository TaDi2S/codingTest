import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int wantSize = want.length;
        
        int cnt = 0;
        
        HashMap<String, Integer> wantMap = null;
        
        while(cnt <= discount.length - 10) {
        	wantMap = new HashMap<>();
            for(int i = 0; i < wantSize; i++) {
            	wantMap.put(want[i], number[i]);
            }
            
            for(int i = cnt; i < cnt + 10; i++) {
            	String prd = discount[i];
            	
            	if(!wantMap.containsKey(prd)) continue;
            	
            	int num = wantMap.get(prd);
            	
            	num--;
            	
            	if(num <= 0) wantMap.remove(prd);
            	else wantMap.put(prd, num);
            	
            }
            
            
            answer = (wantMap.size() <= 0) ? answer+1 : answer;
            cnt++;
            wantMap = null;
        }
        
        return answer;
    }
}