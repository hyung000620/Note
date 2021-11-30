class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            sb.append(n%3);
            n/=3;
        }
        int d = 1;
        String str = sb.toString();

        for(int i=str.length(); i>0; i--){
            String sub = str.substring(i-1,i);
            answer += (d*Integer.parseInt(sub));
            d *=3;
        }
        return answer;
    }
}
