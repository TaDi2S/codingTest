#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    answer.push_back(10);
    for (int i = 0; i < arr.size(); i++) {
        if (arr[i] != answer.back()) {
            answer.push_back(arr[i]);
        }
    }
    answer.erase(answer.begin());
    return answer;
}