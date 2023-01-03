import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        int size = A.length;
        
        for(int i = 0; i < size; i++) {
        	answer += A[i] * B[size-1-i];
        }
        
        
        return answer;
    }
    
}