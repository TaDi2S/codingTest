#include <iostream>
#include <ostream>
#include <string>
#include <vector>

using namespace std;

string solution(string new_id) {
    string answer = "";
    
    string answer_tmp = new_id;
    for (int i = 0; i < answer_tmp.size(); i++) {
        answer_tmp[i] = tolower(answer_tmp[i]);
    }
    for (int i = 0; i < answer_tmp.size(); i++) {
        if ((answer_tmp[i] >= 'a' && answer_tmp[i] <= 'z') || (answer_tmp[i] >= '0' && answer_tmp[i] <= '9') ||          answer_tmp[i] == '_' || answer_tmp[i] == '-' || answer_tmp[i] == '.' ) {
            answer += answer_tmp[i];
        }
        else {
            //answer.erase(answer.begin() + i);
        }
    }
    
    for (int i = 1; i < answer.size(); ++i) {

        if (answer[i - 1] == '.' && answer[i] == '.') {
            answer.erase(answer.begin()+ (i));
            i = 0;
        }
    }

    if (answer.size() > 0 && answer[0] == '.') {
        answer.erase(answer.begin());
    }
    
    if (answer.size() > 0 && answer.back() == '.') {
        answer.erase(answer.end() - 1);
    }
    
    if (answer.size() == 0) {
        answer = "a";
    }

    if (answer.size() > 15) {
        answer.erase(15);
    }
    
    if (answer.back() == '.') {
        answer.erase(answer.end() - 1);
    }
   
    while (answer.size() < 3) {
        answer = answer + answer.back();
    }

    return answer;
}