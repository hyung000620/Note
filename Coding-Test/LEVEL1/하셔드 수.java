class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String strNum = ""+x;
        int y = 0;
        for(int i=0; i< strNum.length(); i++){
            y += Integer.parseInt(String.valueOf(strNum.charAt(i)));
        }
        if(x%y != 0){return false;}
        return answer;
    }
}
