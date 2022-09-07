
import java.util.Arrays;
class Solution {    
   
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0};
        
        int zero_cnt = 0;
        int match_cnt = 0;
        
        for(int i = 0; i < 6; i++) {
        	int num = lottos[i];
        	if(num == 0) {
        		zero_cnt++;
        		continue;
        	}else {
        		if(Arrays.stream(win_nums).anyMatch(n -> n == num)) {
        			match_cnt++;
        		}
        	}   	        	
        }
        
        answer[0] = 7 - match_cnt - zero_cnt;
        if(answer[0] > 6) {
        	answer[0] = 6;
        }
        if(match_cnt == 0) {
        	match_cnt = 1;
        }
        
        answer[1] = 7 - match_cnt;
        
        return answer;
    }
}