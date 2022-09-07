#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    int supo[3] = { 0, };
    int supo_result[3] = { 0, };
    int a_paturn[5] = { 1, 2, 3, 4, 5 };
    int b_paturn[8] = { 2, 1, 2, 3, 2, 4, 2, 5 };
    int c_paturn[10] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };


    for (int i = 0; i < answers.size(); i++) {
        if (a_paturn[supo[0]] == answers[i]) {
            supo_result[0] = supo_result[0] + 1;
        }
        if (b_paturn[supo[1]] == answers[i]) {
            supo_result[1] = supo_result[1] + 1;
        }
        if (c_paturn[supo[2]] == answers[i]) {
            supo_result[2] = supo_result[2] + 1;
        }
        supo[0]++;
        supo[1]++;
        supo[2]++;
        if (supo[0] == 5) {
            supo[0] = 0;
        }
        if (supo[1] == 8) {
            supo[1] = 0;
        }
        if (supo[2] == 10) {
            supo[2] = 0;
        }

    }
    if (supo_result[0] > supo_result[1]) {
        if (supo_result[0] > supo_result[2]) {
            answer.push_back(1);
        }else if (supo_result[0] == supo_result[2]) {
            answer.push_back(1);
            answer.push_back(3);
        }else if (supo_result[0] < supo_result[2]) {
            answer.push_back(3);
        }
    }else if (supo_result[0] == supo_result[1]) {
        if (supo_result[0] > supo_result[2]) {
            answer.push_back(1);
            answer.push_back(2);
        }
        else if (supo_result[0] == supo_result[2]) {
            answer.push_back(1);
            answer.push_back(2);
            answer.push_back(3);
        }
        else if (supo_result[0] < supo_result[2]) {
            answer.push_back(3);
        }
    }else if (supo_result[0] < supo_result[1]) {
        if (supo_result[1] > supo_result[2]) {
            answer.push_back(2);
        }
        else if (supo_result[1] == supo_result[2]) {
            answer.push_back(2);
            answer.push_back(3);
        }
        else if (supo_result[1] < supo_result[2]) {
            answer.push_back(3);
        }
    }
    return answer;
}