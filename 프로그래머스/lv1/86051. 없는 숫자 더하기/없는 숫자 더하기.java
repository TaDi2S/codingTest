import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        answer = 0;
        
        for(int i = 0; i < numbers.length; i++){
            answer = answer + numbers[i];
            
        }
        
        answer = 45 - answer;
        
        return answer;
    }
}