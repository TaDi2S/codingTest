#include <string>
#include <vector>
#include <bitset>

using namespace std;

string jin_bub2(int a, int b) {
    string c = "";
    for (int i = 0; i < b; i++) {
        c = to_string(a % 2) + c;
        a = a / 2;
    }
     return c;
}

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    string c = "";
    for (int i = 0; i < n; i++) {
        c = jin_bub2(arr1[i] | arr2[i], n);
        for (int j = 0; j < n; j++) {
            if (c[j] == '0') c[j] = ' ';
            else if (c[j] == '1')  c[j] = '#';
        }

        answer.push_back(c);
    }


    return answer;
}