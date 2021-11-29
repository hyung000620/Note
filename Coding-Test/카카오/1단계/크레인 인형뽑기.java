import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1]!=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if(!st.isEmpty() && st.peek() == tmp){
                        answer += 2;
                        st.pop();
                    }else{
                        st.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
