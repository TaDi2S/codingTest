import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
		int answer = 0;
		int cnt = nums.length/2;
		Arrays.sort(nums);
		Set<Integer> set = new HashSet<Integer>();
		
		for(int a : nums) {
			set.add(a);
		}
		
		answer = set.size();
		
        if(answer > cnt) {
			return cnt;
		}else {
			return answer;
			
		}
}
}