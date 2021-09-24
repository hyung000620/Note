import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean solution(String[] phoneBook) { 
        boolean answer = true; 
        // 1. HashMap 만들기 
        HashMap<String, Integer> map = new HashMap<>(); 
        // 2. 모든 전화번호 Hashing 하기 (Hash Map에 추가하기) 
        for(int i = 0; i < phoneBook.length; i++) {
        map.put(phoneBook[i], i); 
        }
        // 3. 다시 돌며 각 전화번호의 일부가 HashMap에 있는지 확인하기 (접두어가 존재하는지 확인하기)
        for(int i = 0; i < phoneBook.length; i++) {
            for(int j = 1; j < phoneBook[i].length(); j++) {
                if(map.containsKey(phoneBook[i].substring(0,j))) {
                    answer = false; 
                    return answer;
                } 
            } 
        } 
        return answer; 
    } 
}

