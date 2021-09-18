class Solution {
    public String solution(String[] seoul) {
        int kim = 0;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
               kim = i;
            }
        }
        return "김서방은 "+kim+"에 있다";
    }   
}
