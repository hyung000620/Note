import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int match =0;  //해당되는 번호
        int zero =0; //알수 없는 번호 0 으로 처리
        int[] rank ={6,6,5,4,3,2,1};
        
        for(int i : lottos){
            for(int j : win_nums){
                if(i == 0){
                    zero++;
                    break;
                }
                if(i == j){
                    match++;
                    break;
                }
            }
        }
        //최댓값, 최솟값
        int[] answer = {rank[zero+match],rank[match]};
        
        return answer;
    }
}
