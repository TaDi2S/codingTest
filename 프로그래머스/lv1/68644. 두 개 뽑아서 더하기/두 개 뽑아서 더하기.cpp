#include <string>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;

    for (int i = 0; i < numbers.size(); i++) {
        for (int j = 1; j < numbers.size()-i; j++) {
            answer.push_back(numbers[i] + numbers[i + j]);
        }
    }
    // for (int i = 0; i < answer.size(); i++) {
    //     printf("answer[%d] : %d\n", i, answer[i]);
    // }
    sort(answer.begin(), answer.end());

    answer.erase(unique(answer.begin(), answer.end()), answer.end());

    return answer;
}