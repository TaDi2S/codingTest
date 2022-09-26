import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int[] intArr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int max = Arrays.stream(intArr).max().getAsInt();
        int min = Arrays.stream(intArr).min().getAsInt();
        
        answer = min + " " + max;
        
        return answer;
    }
}