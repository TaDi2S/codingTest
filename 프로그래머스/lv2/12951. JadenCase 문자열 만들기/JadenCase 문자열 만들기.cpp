#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    	bool sentens = true;

	for (int i = 0; i < s.size(); i++) {
		s[i] = tolower(s[i]);
		if (s[i] == ' ') {
			sentens = true;
			continue;
		}
		if (sentens ==true) {
			s[i] = toupper(s[i]);
			sentens = false;
		}
	}
	answer = s;
    return answer;
}