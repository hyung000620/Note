class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i =0; i < signs.length; i++){
            absolutes[i] *= signs[i] ? 1 : -1;
            answer += absolutes[i];
        }
        
        return answer;
    }
}
