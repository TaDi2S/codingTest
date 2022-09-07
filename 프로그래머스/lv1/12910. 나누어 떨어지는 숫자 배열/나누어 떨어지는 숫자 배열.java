import java.util.Arrays;


class Solution {
    public int[] solution(int[] arr, int divisor) {
		int[] answer;
		int[] a = new int[arr.length];
		int cnt = 0;
		for(int num : arr) {
			if(num % divisor == 0) {
				a[cnt] = num;
				cnt++;
			}
		}
		if(cnt == 0) {
			int[] b = {-1};
			return b;
		}
		answer = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			answer[i] = a[i];
		}
		Arrays.sort(answer);
		
        return answer;
	}
}