#include <string>
#include <vector>
#include <algorithm>
using namespace std;


bool compare(pair<double, int>a, pair<double, int>b) {
    if (a.first == b.first) {
        return a.second < b.second;
    }
    else {
        return a.first > b.first;
    }
}


vector<int> solution(int N, vector<int> stages) {
    vector<int> answer;
    vector<pair<double, int>> pair_int;
    pair<int, int> test;
    int cnt = 0;
    sort(stages.begin(), stages.end());
    if (stages[0] != 1) {
        for (int i = 1; i < stages[0]; i++) {
            pair_int.push_back(make_pair(0, i));
        }
    }
    for (int j = 0; j < stages.size(); j++) {
        
        if (stages[j] == N+1) {
            pair_int.push_back(make_pair(stages.size() - j, stages[j]));
            break;
        }
        cnt++;
        if (j == stages.size() - 1) {
            pair_int.push_back(make_pair(cnt, stages[j]));
             if (stages[j] < N + 1) {
                for (int i = stages[j] + 1; i < N + 1; i++) {
                    pair_int.push_back(make_pair(0, i));
                }
            }
            break;
        }
        if (stages[j] != stages[j+1]) {
            pair_int.push_back(make_pair(cnt, stages[j]));
            cnt = 0;
            if (stages[j + 1] - stages[j] >= 2) {
                for (int i = 1; i < stages[j + 1] - stages[j]; i++) {
                    pair_int.push_back(make_pair(0, stages[j] + i));
                }
            }
        }
    }
    int total_user = stages.size();
    double false_per = 0;
    printf("answer(vector) :\n");
    for (int i = 0; i < pair_int.size(); i++) {
        printf("%f, %d\n", pair_int[i].first, pair_int[i].second);
        false_per = (double)pair_int[i].first / total_user;
        total_user = total_user - pair_int[i].first;
        pair_int[i].first = false_per;
        if (total_user == 0) {
            break;
        }
    }
    printf("\n");
    sort(pair_int.begin(), pair_int.end(), compare);
    for (int i = 0; i < pair_int.size(); i++) {
        printf("%f, %d\n", pair_int[i].first, pair_int[i].second);
        if (pair_int[i].second == N+ 1) {
            continue;
        }
        else {
            answer.push_back(pair_int[i].second);
        }
    }


    return answer;
}