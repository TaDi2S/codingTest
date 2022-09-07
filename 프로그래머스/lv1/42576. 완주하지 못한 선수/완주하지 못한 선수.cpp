#include <string>
#include <vector>
#include <algorithm>
#include <unordered_set>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    string answer = "";

    unordered_multiset<string> s;
    
    for (int i = 0; i < completion.size(); i++) {
        s.insert(completion[i]);
    }
   
    for (int i = 0; i < participant.size(); i++) {
        if (s.empty()) {
            return participant[i];
        }
        auto it = s.find(participant[i]);
        if (it == s.end()) {
            return participant[i];
        }else {
            s.erase(it);
        }
    answer = participant[i];
    }

    return answer;
}