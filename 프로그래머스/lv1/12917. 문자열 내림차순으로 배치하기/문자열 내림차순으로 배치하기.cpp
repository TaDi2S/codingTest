#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string s) {
    string answer = "";
    answer = s;
    vector<int> vector_int;

    for (int i = 0; i < s.size(); i++) {
        vector_int.push_back(s[i]);
        printf("vector_int[%d] : %d\n", i, s[i]);
    }

    sort(vector_int.begin(), vector_int.end(), greater<>());
    for (int i = 0; i < answer.size(); i++) {
        answer[i] = (char)vector_int[i];
    }
    return answer;
}