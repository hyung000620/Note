class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        for(int i : numbers){
            sum += i;
        }
        answer = 45 - sum;
        return answer;
    }
}
