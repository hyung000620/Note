import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        
        // 10진법 -> 3진법(역순)
        while(true){
            if(n<3){ temp.add(n); break; }
            temp.add(n%3);
            n = n/3;
        }
        // 3진법(역순) -> 10진법
        for(int i=0; i<temp.size(); i++){
            answer += (Math.pow(3,temp.size()-i-1)*temp.get(i));
        }
        
        return answer;
    }
}
