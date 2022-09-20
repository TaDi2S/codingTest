import java.util.stream.IntStream;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        int sum = IntStream.of(arr).sum();
        
        answer = (double)sum/(double)arr.length;
        
        return answer;
    }
}