import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;
        
        for(int i = 0; i < 32; i++) {
        	
        	if((n&1<<i) > 0) {
        		ans++;
        	}
        }
        

        return ans;
    }
}