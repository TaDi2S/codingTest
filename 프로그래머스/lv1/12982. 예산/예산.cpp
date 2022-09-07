#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<int> d, int budget) {
    int answer = 0;
    vector<int>::iterator it;
    int abc = 0;
    while (1) {
        it = min_element(d.begin(), d.end());
        abc = *it;
        if (budget < abc) {
            break;
        }
        d.erase(it);
        budget = budget - abc;
        answer++;
        if (d.size() == 0) {
            break;
        }
    }

    return answer;
}