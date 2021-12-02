import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = s.length();
        for(int i=1; i<s.length()/2+1; i++){
            String prev = s.substring(0,i);
            int cnt =1;
            String enc ="";
            String last ="";
            for(int j=0; j<s.length(); j+=i){
                if(j+i>s.length()){
                    last = s.substring(j);
                    continue;
                }
                if(prev.equals(s.substring(j,j+i))){
                    cnt ++;
                }else{
                    enc += prev;
                    if(cnt!= 1){
                        enc = cnt + enc;
                    }
                    prev = s.substring(j,j+i);
                    cnt = 1;
                }
            }
            enc += prev + last;
            if(cnt != 1){
                enc = cnt + enc;
            }
            answer = Math.min(answer, enc.length());
        }
        return answer;
    }
}
