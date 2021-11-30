class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int n=0, idx =0, nowInt =0;
        int[] score = new int[3];
        for(int i=0; i<dartResult.length(); i++){
            char ch = dartResult.charAt(i);
            if(Character.isDigit(ch)){ // char형이 숫자인지 체크.
                n = 0;
                if(ch == '1' && dartResult.charAt(i+1)=='0'){
                    n = 10;
                    i++;
                }else{
                    n = Character.getNumericValue(ch); //char형을 int형으로 변환.
                }
                nowInt++;
            }else {
                switch(ch){
                    case 'S':
                        score[idx++] = (int) Math.pow(n,1);
                        break;
                    case 'D':
                        score[idx++] = (int) Math.pow(n,2);
                        break;
                    case 'T':
                        score[idx++] = (int) Math.pow(n,3);
                        break;
                    case '*':
                        idx = idx-2<0?0:idx-2;
                        while(idx<nowInt){
                            score[idx++] *= 2;
                        }
                        break;
                    case '#':
                        score[idx-1] *= -1;
                        n=0;
                        break;
                }
            }
        }
        for(int i: score){
            answer += i;
        }
        return answer;
    }
}
