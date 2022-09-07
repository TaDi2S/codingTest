#include <iostream>
#include <string>
using namespace std;
int palindrome(int i, string s) {
	int answer = 1;
	int cnt = 0;
	for (int j = 0; j <= s.size()-i; j++) {
		for (int k = 0; k <= i / 2; k++) {
			if (s[j+k] == s[j + i - 1 -k]) {
				answer = i;
			}
			else {
				answer = 1;
				break;
			}
			if (j + k == j + i - k) {
				break;
			}

		}
		if (answer == i) {
			break;
		}
		
	}
	if (i < s.size()) {
		cnt = palindrome(i + 1, s);
	}

	if (cnt > answer) {
		answer = cnt;
	}

	return answer;
}

int solution(string s) {
	int answer = 1;
    if(s.size() <= 1){
        return 1;
    }
	answer = palindrome(2, s);

	return answer;
}