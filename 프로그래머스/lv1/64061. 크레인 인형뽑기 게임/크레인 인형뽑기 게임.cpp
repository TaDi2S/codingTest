#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<vector<int>> board, vector<int> moves) {
    int answer = 0;
    vector<int> pang;


//     for (int i = 0; i < board.size()-1; i++) {
//         for (int j = 0; j < board[0].size(); j++) {
//             if (board[i][j] == 0) {
//                 continue;
//             }
//             if (board[i + 1][j] == 0) {
//                 board[i + 1][j] = board[i][j];
//                 board[i][j] = 0;
//             }
//         }
//     }
    for (int k = 0; k < moves.size(); k++) {
        int cnt = 0;
        if (board[board.size()-1][moves[k] - 1] == 0) {
            continue;
        }
        while (cnt < board[0].size()-1 && board[cnt][moves[k] - 1] == 0) {
            cnt++;
        }
        if (pang.size() == 0) {
            pang.push_back(board[cnt][moves[k] - 1]);
        }else {
            if (pang.back() == board[cnt][moves[k] - 1]) {
                pang.pop_back();
                answer++;
            }else {
                pang.push_back(board[cnt][moves[k] - 1]);
            }
        }
        board[cnt][moves[k] - 1] = 0;
    }
 
    answer = answer * 2;
    return answer;
}