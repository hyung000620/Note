class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i< phone_number.length()-4; i++){
            answer += "*";
        }
        String sub = phone_number.substring(phone_number.length()-4,phone_number.length());
        answer += sub;
        return answer;
    }
}
